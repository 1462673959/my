package com.ls.Test.packages.p4;

import java.util.Scanner;
public class Test5 {
	final static int[] mouthR= {31,29,31,30,31,30,31,31,30,31,30,31};
	final int[] mouthP= {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("输入起始年月日");
		int year = s.nextInt();
		int mouth = s.nextInt();
		int day = s.nextInt();
		System.out.println("经过多少月多少天");
		int newMouth = s.nextInt();
		int newDay = s.nextInt();
		getSumDays(year,mouth,day,newMouth,newDay);
	}

	private static void getSumDays(int year, int mouth, int day, int newMouth, int newDay) {
		// TODO Auto-generated method stub
		int sumDays = 0;
		if (mouth+newMouth > 12) {
			if ((year+1)%4==0&&(year+1)%100!=0||(year+1)%400==0) {
				sumDays += 366;
				for (int i = 1; i < (mouth+newMouth)%12; i++) {
					sumDays+=mouthR[i];
				}
			}else {
				sumDays += 365;
				for (int i = 1; i < (mouth+newMouth)%12; i++) {
					sumDays+=mouthR[i];
				}
			}
		}
	}

}
