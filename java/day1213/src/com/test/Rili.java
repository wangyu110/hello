package com.test;

import java.util.Scanner;

public class Rili {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("���������");
		int year = in.nextInt();
		System.out.println("�������·�");
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
		//sum��¼��1900��1��1�գ�����һ����Ŀǰ�·�������  
		System.out.println(sum);
		//b��¼�����·�����
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
		//a��¼ÿ�¿�ͷtab����   �����ϸ���������sum-b����������
		int a =(sum-b) % 7+1;
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//count��¼����  ��7����
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
