package com.test;

import java.util.Scanner;

public class Rili {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = in.nextInt();
		System.out.println("请输入月份");
		int month = in.nextInt();
		int sum = 0;

		for (int i = 1900; i < year; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				sum += 366;
			} else {
				sum += 365;
			}
		}

		for (int i = 1; i <= month; i++) {
			if (i == 2) {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					sum += 29;
				} else {
					sum += 28;
				}
			} else {
				if (i == 4 || i == 6 || i == 9 || i == 11) {
					sum += 30;
				} else {
					sum += 31;
				}
			}
		}
		//sum记录从1900年1月1日（星期一）到目前月份总天数  
		System.out.println(sum);
		//b记录各个月份天数
		int b = 0;
		if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				b = 29;
			} else {
				b = 28;
			}
		} else {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				b = 30;
			} else {
				b = 31;
			}
		}
		//a记录每月开头tab个数   就是上个月天数（sum-b）除的余数
		int a =(sum-b) % 7+1;
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//count记录次数  逢7换行
		int count=0;
		for (int i = 1; i <= a; i++) {
			System.out.print("\t");
			count++;
		}
		for (int i = 1; i <= b; i++) {	
			System.out.print(i + "\t");
			count++;
			if(count%7==0){
				System.out.println();
			}
		}
		

	}
}
