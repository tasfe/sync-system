package com.store.service;

import java.util.List;

import com.store.domain.User;

public interface IUserService {

	public List<User> getUserByName(String name);
	
	public User login(String loginName,String password);
	
	public Integer addUser(User user);
	
	public boolean updateUser(Integer id,User user);
	
	public boolean deleteUser(Integer id);
	
	/**
	 * 根据多个ID批量删除用户
	 * @param ids
	 * @return
	 */
	public Integer deleteUsers(Integer[] ids);
	
	/**
	 * 检查登录名是否被注册。（登录名不能重复）
	 * @param name
	 * @return
	 */
	public boolean checkLoginName(String name);
}
