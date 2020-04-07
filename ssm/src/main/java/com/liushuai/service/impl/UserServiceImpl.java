package com.liushuai.service.impl;

import java.util.List;

import com.liushuai.pojo.Page;
import com.liushuai.pojo.User;

public interface UserServiceImpl {
	public List<User> page(Page page);
	public void delet(int id);
	public void update(User user);
	public void insert(User user);
	public User get(int uNo);
	public int total();
}
