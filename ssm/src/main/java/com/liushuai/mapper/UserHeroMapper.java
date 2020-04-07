package com.liushuai.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.liushuai.pojo.Hero;
import com.liushuai.pojo.UserHero;
@Mapper
public interface UserHeroMapper {
	public List<UserHero> getUserHeros(@Param("id")int id);
}
