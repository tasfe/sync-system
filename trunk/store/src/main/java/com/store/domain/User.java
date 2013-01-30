package com.store.domain;

import java.util.HashSet;
import java.util.Set;

public class User {

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
	
	//是否禁用
	private boolean disable;

	public long getId() {
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

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	public Integer getPurview() {
		return purview;
	}

	public void setPurview(Integer purview) {
		this.purview = purview;
	}

}
