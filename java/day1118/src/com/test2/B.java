package com.test2;

public class B {
	//属性
	private String name ;
	
	public static C put =new C("李四");
	//构造

	public B(String name) {
		super();
		this.name = name;
	}
	
	//方法
	public void myout(){
		System.out.println(name);
	}
}
