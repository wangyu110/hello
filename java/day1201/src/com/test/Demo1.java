package com.test;

import java.util.ArrayList;

public class Demo1 {
	public void test1(){
		ArrayList<String> list =new ArrayList<String>();
		list.add("a");
		list.add("b");
		System.out.println(list);
		
		MyClass<String> m1=new MyClass<String>();
		m1.add("��--","��");
		MyClass1<String> m2=new MyClass1<String>();
		m2.add("��--","��");
		
	}
	public void test2(){
		System.out.println("game over!");
	}
}
