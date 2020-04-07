package com.liushuai.pojo;

import java.util.Date;

import com.liushuai.util.DateUtils;

public class BuyHero {
	private int id;
	private Hero hero;
	private Date buyDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Hero getHero() {
		return hero;
	}
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(java.sql.Date buyDate) {
		System.out.println(buyDate);
		this.buyDate = DateUtils.Datas2j(buyDate);
	}
	public BuyHero() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BuyHero [id=" + id + ", hero=" + hero + ", buyDate=" + buyDate + "]";
	}
	
}
