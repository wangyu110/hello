package com.test3;

import java.security.GeneralSecurityException;

public class Outer {
	private String name="张三";
	private static String type="李四";
	public Outer(){
		
	}
	public void out1(){
		System.out.println(getName());
	}
	public static void out2(){
		System.out.println(type);
	}
	
	public class Inner{
	 
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
