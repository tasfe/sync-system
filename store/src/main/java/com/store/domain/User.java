package com.store.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User implements BaseEntity{
	@Override
	public String tableName() {
		return "syn_account";
	}

	private long id;	
	//登录账号
	private String loginName;
	private String password;
	//显示名
	private String userName;
	
	//对应的店铺集合
	private Set<Shop> shops = new HashSet<Shop>();
	
	//使用数字代表权限：1:超级管理员 2：管理员  3：兼职  .....
	private Integer purview;
	

	private int status;

	@SuppressWarnings("unchecked")
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<Shop> getShops() {
		return shops;
	}

	public void setShops(Set<Shop> shops) {
		this.shops = shops;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getPurview() {
		return purview;
	}

	public void setPurview(Integer purview) {
		this.purview = purview;
	}

	@Override
	public Map<String, Object[]> getFieldInfo() {		
		Map<String, Object[]> map = new HashMap<String, Object[]>();
		map.put("id", new Object[] { id, "setId", long.class });
		map.put("account", new Object[] { loginName, "setLoginName", String.class });
		map.put("password", new Object[]{password, "setPassword", int.class});
		map.put("username", new Object[]{userName, "setUserName", String.class});
		map.put("purview", new Object[] {purview, "setPurview", int.class });
		map.put("status", new Object[] {status, "setStatus", int.class });		
		return map;
	}
}
