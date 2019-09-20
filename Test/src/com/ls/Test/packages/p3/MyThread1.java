package com.ls.Test.packages.p3;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printNumber();
	
	}
	public void printNumber() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}
