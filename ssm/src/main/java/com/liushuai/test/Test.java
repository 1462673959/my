package com.liushuai.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.liushuai.mapper.HeroMapper;
import com.liushuai.pojo.Hero;
import com.liushuai.service.HeroService;
import com.liushuai.util.RedisUtil;

public class Test {
	@org.junit.Test
	public void f() throws IOException {
		System.out.println("大家好！");
		System.out.println("大家好！");
	}
}
