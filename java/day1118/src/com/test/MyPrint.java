package com.test;

public class MyPrint {
	//属性
	private String name;
	//构造
	public MyPrint(String name){
		this.name=name;
	}
	//方法
	public void myprint(){
		System.out.println(name+" 调用对象中的静态属性中的静态属性来调用方法");
	}

	
}
