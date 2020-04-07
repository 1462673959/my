package com.liushuai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liushuai.mapper.UserMapper;
import com.liushuai.pojo.Page;
import com.liushuai.pojo.User;
import com.liushuai.service.impl.UserServiceImpl;

@Service
public class UserService implements UserServiceImpl{
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> page(Page page) {
		// TODO Auto-generated method stub
		System.out.println("查询所有用户");
		return userMapper.page(page);
	}

	@Override
	public void delet(int id) {
		// TODO Auto-generated method stub
		userMapper.delet(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	public User get(int uNo) {
		// TODO Auto-generated method stub
		return userMapper.get(uNo);
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return userMapper.total();
	}
	
}
