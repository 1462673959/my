package com.liushuai.service.impl;

import java.util.List;

import com.liushuai.pojo.HeroSkill;


public interface SkillServiceImpl {
	public List<HeroSkill> allSkill();
	public void  deletSkill(int id);
	public void  updataSkill(HeroSkill skill);
	public void  insertSkill(HeroSkill skill);
}
