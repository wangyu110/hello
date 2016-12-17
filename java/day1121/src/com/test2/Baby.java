package com.test2;

public class Baby extends Member{
	public Baby(String name,int age,String role){
		super(name,age,role);
	}
	public void work(){
		System.out.println("我是"+getName()+"今年："+getAge()+"所以不工作");
	}
}
