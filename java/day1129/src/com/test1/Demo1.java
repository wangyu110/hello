package com.test1;

public class Demo1 {
	public void test1(){
		//装箱拆箱
		int a=10;
		Integer b=new Integer(20);
		
		Integer a1=new Integer(a);
		Integer a2=Integer.valueOf(a);
		Integer a3=a1;//自动装箱
		
		int b1=b.intValue();
		int b2=b;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(b1);
		System.out.println(b2);
		
	}
}
