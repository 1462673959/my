package com.liushuai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.liushuai.pojo.Hero;


@Mapper
public interface HeroMapper {
	public List<Hero> heros();
	@Delete("delete from hero where id = #{id}")
	public void  deletHero(int id);
	public void  updataHero(Hero hero);
	public void  insertHero(Hero hero);
}
