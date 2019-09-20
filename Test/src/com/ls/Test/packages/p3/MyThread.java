package com.ls.Test.packages.p3;

public class MyThread extends Thread{
	public String name;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		printNumber();
	}
	public void printNumber() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+name);
		}
	}
	public MyThread(String name) {
		super();
		this.name = name;
	}
}
