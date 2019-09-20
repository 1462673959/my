package com.ls.Test.packages.p3;

public class BankAccount {
	int zhanghao;
	private static final Object obj = new Object();
	public int balance = 10000;
	public void getMoney(String name,int x) {
		synchronized(obj) {
		System.out.println(name+"取錢前余額："+balance);
		this.balance = this.balance - x;
		System.out.println(name+"取走"+x+"元");
		}
		
	}
}
