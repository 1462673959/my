package com.liushuai.pojo;

import java.util.List;

public class HeroClassify {
	private int id;
	private List<Hero> hList;
	private String name;
	public HeroClassify() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HeroClassify(int id, List<Hero> hList, String name) {
		super();
		this.id = id;
		this.hList = hList;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Hero> gethList() {
		return hList;
	}
	public void sethList(List<Hero> hList) {
		this.hList = hList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HeroClassify [id=" + id + ", hList=" + hList + ", name=" + name + "]";
	}
	
}
