package com.ls.Test.packages.p4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入年月日");
		int year = s.nextInt();
		int mouth = s.nextInt();
		int day = s.nextInt();
		int sumDays = getSumDay(year,mouth,day);
		System.out.println(year+"年"+mouth+"月"+day+"日"+"是這一年的第"+sumDays+"天");

	}
	private static int getSumDay(int year, int mouth, int day) {
		// TODO Auto-generated method stub
		int days = 0;
		for (int i = 1; i < mouth; i++) {
			days += getMouthDay(year,i);
		}
		return days+day;
	}
	private static int getMouthDay(int year, int mouth) {
		// TODO Auto-generated method stub
		switch (mouth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			if (year%4==0&&year%100!=0||year%400 ==0) {
				return 29;
			}else {
				return 28;
			}
		}
	}
	

}
