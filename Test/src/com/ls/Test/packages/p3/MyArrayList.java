package com.ls.Test.packages.p3;

import java.util.Arrays;
import java.util.HashMap;

public class MyArrayList<E> {
	private E[] data;
	private int size;
	private final int chushi = 10;
	public  MyArrayList() {
		data = (E[]) new Object[chushi];
		this.size = 0;
	};
	public void add(E e) {
		if(size == data.length) {
			//扩容
			data = kuorong(data);
		}else {
			data[size+1] = e;
			size++;
		}
	}
	public E[] kuorong(E[] data) {
		int[] a= new int[10];
	
		E[] newData = (E[]) new Object[data.length+chushi];
		System.arraycopy(data,chushi, newData, chushi, chushi);
		return newData;
	}
	public static void main(String[] args) {
		MyArrayList<String> myArrayList = new MyArrayList<>();
		System.out.println(myArrayList.size);
		myArrayList.add("dasdas");
		myArrayList.add("drqwrqwrwqr");
		System.out.println(myArrayList);
		System.out.println(myArrayList.size);
	}
	@Override
	public String toString() {
		return "[" + Arrays.toString(data) +  "]";
		
	}
}
