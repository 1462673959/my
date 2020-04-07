package com.liushuai.pojo;

public class HeroImage {
	private int id;
	private Hero hero;
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HeroImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HeroImage [id=" + id + ", hero=" + hero + ", type=" + type + "]";
	}
	
}
