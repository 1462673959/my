package com.liushuai.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.liushuai.pojo.Hero;
import com.liushuai.pojo.Page;
import com.liushuai.pojo.User;
import com.liushuai.pojo.UserHero;
import com.liushuai.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/deletUser")
	public void deletUser(){
		int id = 1;
		userService.delet(id);
	}
	@RequestMapping("/updataUser")
	public void updataUser(User user){
		userService.update(user);
	}
	@RequestMapping("/insertUser")
	public void insertUser(){
		User user = new User();
		userService.insert(user);
	}
	
	@RequestMapping("/loginPage")
	public ModelAndView login(HttpServletRequest request,HttpSession session){
		ModelAndView mView = new ModelAndView();
		if (false) {
			mView.setViewName("succes");
			return mView;
		}
		mView.setViewName("login");
		return mView;
	}
	@RequestMapping("/login")
	public ModelAndView selectUser(User user){
		if (user.getuPassword().equals(userService.get(user.getuNo()).getuPassword())) {
			return new ModelAndView("succes");
		}
		return new ModelAndView("login");
	}
	@RequestMapping("/list")
	public List<User> page(@RequestBody Page page){
		System.out.println(page);
		page.jisuanLast(userService.total());
		return userService.page(page);
	}
}
