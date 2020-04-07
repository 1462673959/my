package com.liushuai.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.liushuai.mapper.UserHeroMapper;
import com.liushuai.pojo.Hero;
import com.liushuai.pojo.User;
import com.liushuai.pojo.UserHero;
import com.liushuai.service.HeroService;

@RestController
public class HeroController {
	@Autowired
	UserHeroMapper userHeroMapper;
	@Autowired
	HeroService hService;
	@RequestMapping("/heros")
	public List<Hero> hList(){
		System.out.println("进入controller！");
		return hService.heros();
	}
	@RequestMapping("/deletHero")
	public void deletHero(){
		int id = 7;
		hService.deletHero(id);
	}
	@RequestMapping("/updataHero")
	public void updataHero(){
		Hero hero = new Hero();
		hService.updataHero(hero);
	}
	@RequestMapping("/insertHero")
	public void insertHero(){
		Hero hero = new Hero();
		hService.insertHero(hero);
	}
	@RequestMapping("/getall")
	public List<UserHero> getAllMyHero(User user){
		System.out.println("来了");
		System.out.println(user.getId());
		return userHeroMapper.getUserHeros(user.getId());
	}
	
}
