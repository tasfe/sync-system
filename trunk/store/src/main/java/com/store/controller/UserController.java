package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.domain.User;
import com.store.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired(required=true)
	private IUserService userService;
	
	@RequestMapping("/login")
	public String login(String loginName,String password,ModelMap map){
		User loginUser = userService.login(loginName, password);
		if(loginUser == null){
			return "fail";
		}else{
			map.addAttribute("loginUser",loginUser);
			return "welcome";
		}
	}
	
	@RequestMapping("/list")
	public List<User> getUsersByParam(ModelMap map){
		//userService.getUsersByParam();
		return null;
	}
}