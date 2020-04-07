package com.liushuai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liushuai.mapper.HeroMapper;
import com.liushuai.pojo.Hero;
import com.liushuai.service.impl.HeroServiceImpl;

@Service
public class HeroService implements HeroServiceImpl{
	@Autowired
	HeroMapper heroMapper;
	@Override
	public List<Hero> heros() {
		// TODO Auto-generated method stub
		System.out.println("查询所有英雄！");
		return heroMapper.heros();
	}
	@Override
	public void deletHero(int id) {
		// TODO Auto-generated method stub
		heroMapper.deletHero(id);
	}
	@Override
	public void updataHero(Hero hero) {
		// TODO Auto-generated method stub
		heroMapper.updataHero(hero);
	}
	@Override
	public void insertHero(Hero hero) {
		// TODO Auto-generated method stub
		heroMapper.insertHero(hero);
	}	
}
