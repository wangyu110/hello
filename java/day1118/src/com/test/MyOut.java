package com.test;

public class MyOut {
	//动态属性
	private String name;

	public  MyPrint print=new MyPrint("王五");
	//构造
	public MyOut(String name){
		this.name=name;
	}
	//方法
	
	public void myout(){
		System.out.println(name+"  调用对象中的静态属性调用方法");
	}

	
	
}
