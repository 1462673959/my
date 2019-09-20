package com.ls.Test.packages.p4;

import com.ls.Test.packages.p3.Good;
import com.ls.Test.packages.p3.Lanzi;

public class Test3 {
	public static void main(String[] args) {
		Good apple = new Good("苹果");
		Good egg = new Good("鸡蛋");
		Lanzi a = new Lanzi("A");
		Lanzi b = new Lanzi("B");
		a.load(apple);
		b.load(egg);
		a.swap(b);
		System.out.println(a.getGood().getName());
	}
}
