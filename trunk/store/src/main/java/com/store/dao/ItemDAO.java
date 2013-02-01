package com.store.dao;


import org.springframework.stereotype.Repository;

import com.store.domain.Item;


/**
 * 
 * @author Administrator
 *
 */
@Repository("itemDao")
public class ItemDAO extends BaseDAO<Item>{

	public Item find(String id){
		Item item = new Item();
		String sql = "select * from " + item.tableName() + " where id = ?";
		item = getJdbcTemplate().queryForObject(sql, getRowMapper(), id);
		return item;
	}
	
	public Integer addItem(String sql, Item item) {
		Object[] objs = {
			item.getId(),
			item.getStock(),
			item.getLink(),
			item.getTitle(),
			item.getShop_id(),
			item.getCreate_at(),
			item.getUpdate_at()
		};
		int result = getJdbcTemplate().update(sql, objs);
		return result;
	}

}
