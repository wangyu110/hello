package com.test1;

import javax.tools.Diagnostic;

import com.test1.Demo1.Demo2;

public class Test {

	public static void main(String[] args) {
		Demo1 d1=new Demo1("zhang", 12);
//		d1.test1();
		//ͨ���ⲿ����󴴽��ڲ������
		
		//������̬�ڲ���Ķ���
		Demo2 d2=d1.new Demo2("male", 20);
		d2.test2();
		//<�ⲿ������>.<�ڲ�������> ���ñ��� = new <�ⲿ������>.<�ڲ��๹����>		
		//������̬�ڲ������
//		Demo1.Demo2 s=new Demo1.Demo2("mole", 12);
//		s.test2();
		
	}

}
