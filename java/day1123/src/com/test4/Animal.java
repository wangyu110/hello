package com.test4;

public class Animal {
	private String name="";
	public Animal(String name){
		this.name=name;
	}
	public void eat(){
		System.out.println(name+"吃东西");
	}
	public void sleep(){
		System.out.println(name+"睡觉动物类里的");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
