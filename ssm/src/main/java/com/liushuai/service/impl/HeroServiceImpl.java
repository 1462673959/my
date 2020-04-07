package com.liushuai.service.impl;

import java.util.List;

import com.liushuai.pojo.Hero;
public interface HeroServiceImpl {
	public List<Hero> heros();
	public void  deletHero(int id);
	public void  updataHero(Hero hero);
	public void  insertHero(Hero hero);
}
