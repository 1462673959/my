package com.liushuai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liushuai.mapper.SkillMapper;
import com.liushuai.pojo.HeroSkill;
import com.liushuai.service.impl.SkillServiceImpl;
@Service
public class SkillService implements SkillServiceImpl{
	@Autowired 
	private SkillMapper skillMapper;
	@Override
	public List<HeroSkill> allSkill() {
		// TODO Auto-generated method stub
		return skillMapper.allSkill();
	}

	@Override
	public void deletSkill(int id) {
		// TODO Auto-generated method stub
		skillMapper.deletSkill(id);
	}

	@Override
	public void updataSkill(HeroSkill skill) {
		// TODO Auto-generated method stub
		skillMapper.updataSkill(skill);
	}

	@Override
	public void insertSkill(HeroSkill skill) {
		// TODO Auto-generated method stub
		skillMapper.insertSkill(skill);
	}

}
