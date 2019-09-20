package com.ls.Test.packages.p4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.ls.Test.packages.p3.Product;
import com.ls.Test.packages.p3.User;
import com.ls.Test.packages.p3.UserManager;

public class Test7 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数组值：");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*10);
		}
		scanner.close();
		int x = a[0];
		for (int j : a) {
			System.out.println(j);
			if (j > x) {
				x = j;
			}
		}
		System.out.println(x);
		System.out.println(Arrays.toString(a));
		System.out.println(sum(1,2,3));
		System.out.println(sum(4,5,6));
		int [] arr = {1,2,3,4,5};
		int [] arr2 = new int[arr.length*2];
		int [] arr1 = new int[6];
		for (int i = 0; i < 2; i++) {
			arr1[i] = arr[i];
		}
		for (int i = 2; i < arr.length; i++) {
			arr1[i+1] = arr[i];
		}
		arr1[2] = 6;
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr = arr2;
		String aString = "123";
		String bString = "123";
		System.out.print(aString==bString);
		System.out.println(Arrays.toString(arr));
		
		arr = Arrays.copyOf(arr, arr.length*3);
		System.out.println(Arrays.toString(arr));
		int x1= 10;
		int y =20;
		int [] arr4 = {x1,y};
		int [] arr3 = {1,5,4,5};
		int [] arr5 = {4,5,6,8,9};
		System.out.println(Arrays.toString(arr4));
		int [] [] arr6 = {arr3 ,arr4,arr5};
		System.out.print(Arrays.deepToString(arr6));
		
		for (int[] is : arr6) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println("\n");
		}
		int [] [] x11 = {{1,5,4,5},{4,5,6,8},{1,8,7}};
		int [] [] x2 = new int[5][3];
		for (int i = 0; i < x2.length; i++) {
			for (int j = 0; j < x2[i].length; j++) {
				System.out.print(x2[i][j]+"\t");
			}
			System.out.println();
		}*/
		/*int [] data = {1,2,3,7,5};
		int [] data1 = {1,9,3,7,5};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		//System.out.print(Arrays.compare(data, data1));
		System.out.print(Arrays.binarySearch(data, 7));
		Arrays.fill(data, 0,1,888);
		System.out.println(Arrays.toString(data));
		
		Product p1 = new Product("鸡蛋", 10);
		Product p2 = new Product("肉", 12);
		Product p3 = new Product("西红柿", 8);
		Product p4 = new Product("黄瓜", 5);
		Product[] p = {p1,p2,p3,p4} ;
		System.out.println(Arrays.toString(p));
		Arrays.sort(p, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o2.getPrice()-o1.getPrice();
			}
		});
		System.out.println(Arrays.toString(p));
		
		UserManager userManager = new UserManager();
		User user = new User("小米", "123");
		userManager.addUser(user);
		userManager.addUser(user);
		User user2 = new User("小李", "123");
		System.out.println(userManager.getSize());
		userManager.addUser(user2);
		for (int i = 0; i < userManager.getSize(); i++) {
			System.out.println((userManager.getUsers()[i]).toString());
		}
		String string = new String();
		System.out.println(string);
		System.out.println(string.equals("") );
		
		System.out.println(string == null);
		byte[] bs = {45,89,75,102,89,45};
		String string2 = new String(bs,1,3);
		System.out.println(string2);
		bs = "我是刘帅s".getBytes();
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}
		char[] cs = {'刘','帅'};
		string2 = new String(cs);
		System.out.println(string2);
		short s1 = 0;
		s1 = (short) (s1 +1);*/
		String string3 = new String("adsdsads");
		for (int i = 0; i < string3.length(); i++) {
			System.out.println(string3.charAt(i));
		}
	
	}
	public static int sum(int ... x) {
		int sum=0;
		for (int i : x) {
			sum += i;
		}
		return sum;
	}

}
