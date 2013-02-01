package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.domain.User;
import com.store.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(String loginName,String password,ModelMap map){
		/*User loginUser = userService.login(loginName, password);
		if(loginUser == null){
			return "fail";
		}else{
			map.addAttribute("loginUser",loginUser);
			return "welcome";
		}*/
		return "";
	}
	
	@RequestMapping("/list")
	public List<User> getUsersByParam(ModelMap map){
		//userService.getUsersByParam();
		return null;
	}
}