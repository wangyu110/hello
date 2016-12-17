package com.demo2;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Student {
	private String name;
	private int age;	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void study(){
		System.out.println(getName()+"¹þºÃÑ§Ï°");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +"-"+ age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
