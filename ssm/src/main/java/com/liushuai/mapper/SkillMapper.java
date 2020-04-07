package com.liushuai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.liushuai.pojo.HeroSkill;



@Mapper
public interface SkillMapper {
	@Select("select * from skill")
	public List<HeroSkill> allSkill();
	@Delete("delete from skill where id = #{id}")
	public void  deletSkill(int id);
	public void  updataSkill(HeroSkill skill);
	public void  insertSkill(HeroSkill skill);
}
