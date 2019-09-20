package com.ls.Test.packages.p4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import com.ls.Test.packages.p3.Student;
class RThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"听歌");
		}
	}
	
}
public class Test12 {
	public static void main(String[] args) throws InterruptedException{
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					list.add(Thread.currentThread().getName());
				}
			},"线程1").start();
	
		}
		Thread.sleep(5000);
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.size());
	}	
}
