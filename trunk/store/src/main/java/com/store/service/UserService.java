package com.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.common.util.SpringUtil;

import com.store.dao.UserDAO;

@Service
public class UserService{
	@Autowired
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public static UserService instance(){
		return SpringUtil.getEnv().getBean(UserService.class);
	}
	
	
}
