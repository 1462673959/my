package com.ls.Test.packages.p4;

import java.util.Timer;
import java.util.TimerTask;


public class Test10 {
	private static final Object OBJ = new Object();
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("你好");
			}
		}, 5000, 2000);
	}
	public synchronized void m1() {
		System.out.println("m1方法开始执行");
		for (int i = 0; i < 100; i++) {
			System.out.println("m1-->"+i);
		}
		System.out.println("m1方法结束执行");
	}
	public synchronized static void m2() {
		System.out.println("m2方法开始执行");
		for (int i = 0; i < 100; i++) {
			System.out.println("m2-->"+i);
		}
		System.out.println("m2方法结束执行");
	}
}
