package com.liushuai.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.liushuai.util.DateUtils;

public class UserHero {
	private int  id;
	private User user;
	private List<BuyHero> buyHeros;
	public UserHero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<BuyHero> getBuyHeros() {
		return buyHeros;
	}


	public void setBuyHeros(List<BuyHero> buyHeros) {
		this.buyHeros = buyHeros;
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "UserHero [id=" + id + ", user=" + user + ", buyHeros=" + buyHeros + "]";
	}


	
	
	
	
}
