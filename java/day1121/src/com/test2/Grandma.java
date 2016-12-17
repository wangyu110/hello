package com.test2;

public class Grandma extends Member {
	
	private String role;
	public Grandma(String name,int age,String role){
		super(name, age,role);
		this.role=role;
	}
	public void intro(){
		System.out.println("我是"+role+"name:"+getName()+"今年："+getAge());
	}
}
