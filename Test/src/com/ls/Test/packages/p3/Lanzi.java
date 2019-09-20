package com.ls.Test.packages.p3;

public class Lanzi {
	String name;//篮子的名称
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Good getGood() {
		return good;
	}
	public void setGood(Good good) {
		this.good = good;
	}
	Good good;//物品
	public Lanzi(String name) {
		this.name = name;
		System.out.println("篮子"+name+"被创建！");
	}
	public void load(Good good) {
		this.good = good;
		System.out.println("篮子"+name+"装入了"+good.getName());
	}
	public void swap(Lanzi b) {
		String name = b.good.getName();
		b.good.setName(this.good.name);
		this.good.setName(name);
		System.out.println(this.name+"的"+this.good.getName()+"与"+b.name+"的"+b.good.getName()+"交换");
	}

}
