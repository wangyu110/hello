package com.demo1;

public class Student1 {
	private String name;
	private int age;
	public Student1(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"-"+age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
