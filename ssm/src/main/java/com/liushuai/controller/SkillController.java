package com.liushuai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liushuai.pojo.Hero;
import com.liushuai.pojo.HeroSkill;
import com.liushuai.service.SkillService;

@RestController
public class SkillController {
	@Autowired
	private SkillService skillService;
	@RequestMapping("/skills")
	public List<HeroSkill> sList(){
		System.out.println("进入controller！");
		return skillService.allSkill();
	}
	@RequestMapping("/deletSkill")
	public void deletSkill(){
		int id = 7;
		skillService.deletSkill(id);
	}
	@RequestMapping("/updataSkill")
	public void updataSkill(){
		HeroSkill skill = new HeroSkill();
		skillService.updataSkill(skill);
	}
	@RequestMapping("/insertSkill")
	public void insertSkill(){
		HeroSkill skill = new HeroSkill();
		skillService.insertSkill(skill);
	}
}
