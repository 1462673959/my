package com.liushuai.pojo;

import java.util.List;

public class Hero {
	private int id;
	private String name;
	private int hp;
	private List<HeroSkill> skills;
	private List<HeroClassify> classifies;
	private double price;
	private HeroImage mainImage;
	private List<HeroImage> heroImages;
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public List<HeroSkill> getSkills() {
		return skills;
	}
	public void setSkills(List<HeroSkill> skills) {
		this.skills = skills;
	}
	public List<HeroClassify> getClassifies() {
		return classifies;
	}
	public void setClassifies(List<HeroClassify> classifies) {
		this.classifies = classifies;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public HeroImage getMainImage() {
		return mainImage;
	}
	public void setMainImage(HeroImage mainImage) {
		this.mainImage = mainImage;
	}
	public List<HeroImage> getHeroImages() {
		return heroImages;
	}
	public void setHeroImages(List<HeroImage> heroImages) {
		this.heroImages = heroImages;
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", hp=" + hp + ", skills=" + skills + ", classifies=" + classifies
				+ ", price=" + price + ", mainImage=" + mainImage + ", heroImages=" + heroImages + "]";
	}
	
	
	
	
}
