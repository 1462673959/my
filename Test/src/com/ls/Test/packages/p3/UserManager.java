package com.ls.Test.packages.p3;

import java.util.Arrays;
import java.util.Scanner;

public class UserManager {
	private User[] users;
	private int size;
	public void addUser(User user) {
		if (size > 5) {
			System.out.println("用户已满");
			Scanner scanner = new Scanner(System.in);
			System.out.println("是否扩容！（Y/N）:");
			String c = scanner.next();
			if (c.equals("Y")) {
				users = Arrays.copyOf(users, users.length*2);
			}else {
				return;
			}
		}
		if (!userExist(user)) {
			users[size] = user;
			size++;
		}else {
			System.out.println("已经存在！");
		}
	}
	@Override
	public String toString() {
		return "UserManager [users=" + Arrays.toString(users) + ", size=" + size + "]";
	}
	public User[] getUsers() {
		return users;
	}
	public void setUsers(User[] users) {
		this.users = users;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	private boolean userExist(User user) {
		// TODO Auto-generated method stub
		if (size ==0 ) {
			return false;
		}
		for (int i = 0; i < size; i++) {
			if (users[i].equals(user)) {
			return true;	
			}
		}
		
		return false;
	}
	public UserManager() {
		// TODO Auto-generated constructor stub
		users = new User[5];
		System.out.println("构造1");
		size = 0;
	}
	
}
