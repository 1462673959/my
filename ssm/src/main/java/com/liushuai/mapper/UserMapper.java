package com.liushuai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.liushuai.pojo.Page;
import com.liushuai.pojo.User;

@Mapper
public interface UserMapper {
	public List<User> getAll();
	public void delet(int id);
	public void update(User user);
	public void insert(User user);
	@Select("select u.* from user u where u.uNo = #{uNo}")
	public User get(int uNo);
	public int total();
	public List<User> page(Page page);
}
