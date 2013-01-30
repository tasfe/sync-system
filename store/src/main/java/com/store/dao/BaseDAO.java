package com.store.dao;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.store.domain.BaseEntity;

/**
 * 基类
 * @author Administrator
 *
 * @param <T>
 */
public abstract class BaseDAO<T extends BaseEntity>{
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * 单个对象查询
	 * @param id
	 * @return
	 */
	public T find(long id){
		String sql = "select * from " + initT().tableName() + " where id = ?";
		getJdbcTemplate().queryForObject(sql, getRowMapper(), id);
		return null;
	}
	/**
	 * 条件查询
	 * @param sql
	 * @param obj
	 * @return
	 */
	public List<T> queryForList(String sql , Object...obj){
		return getJdbcTemplate().query(sql,getRowMapper() ,obj);
	}
	
	/**
	 * 更新
	 * @param t
	 */
	public void update(T t){
		if (t == null) {
			return;
		}
		Map<String, Object[]> map = t.getFieldInfo();
		if (map == null)
			return;
		StringBuilder fieldNames = new StringBuilder();
		List<Object> params = new ArrayList<Object>();

		for (String key : map.keySet()) {
			if (key.equals("id"))
				continue;
			fieldNames.append(key + "=?,");
			Object o[] = (Object[]) map.get(key);
			params.add(o[0]);
		}
		fieldNames.append(" where id = ?");
		Object o[] = (Object[]) map.get("id");
		params.add(o[0]);
		StringBuilder sql = new StringBuilder();
		sql.append("update ").append(t.tableName()).append(" set ").append(fieldNames.toString().replaceFirst("=\\?, where", "=? where"));
		getJdbcTemplate().update(sql.toString(), params.toArray());
	}
	/**
	 * 删除.
	 * 
	 * @param apply.
	 */
	public void delete(T t) {
		getJdbcTemplate().update("delete from " + t.tableName() + " where id=?", t.getId());
	}
		
	private T initT(){
		try {
			return getClazzOfT().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取泛型T的class
	 * 
	 * @date 2012-5-23 下午03:54:47
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private Class<T> getClazzOfT() {
		return (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/**
	 * 手动实现的RomMapper
	 * @return
	 */
	public RowMapper<T> getRowMapper(){
		RowMapper<T> rowMapper = new RowMapper<T>() {
			@Override 
			public T mapRow(ResultSet rs, int rowNum) throws SQLException {
				T t = initT();
				Map<String, Object[]> map = initT().getFieldInfo();
				for (String key : map.keySet()) {
					Object o[] = map.get(key);
					try {
						Method m = getClazzOfT().getMethod((String) o[1], new Class[] { (Class<?>) o[2] });
						if (m != null) {
							if (o[2] == int.class) {
								m.invoke(t, rs.getInt(key));
							} else if (o[2] == long.class) {
								m.invoke(t, rs.getLong(key));
							} else if (o[2] == String.class) {
								m.invoke(t, rs.getString(key));
							} else if (o[2] == Date.class) {
								m.invoke(t, rs.getTimestamp(key));
							} else if (o[2] == boolean.class) {
								m.invoke(t, rs.getBoolean(key));
							}
						}
					} catch (Exception e) {

					}
				}
				return t;
			}
		};
		return rowMapper;
	}
}
