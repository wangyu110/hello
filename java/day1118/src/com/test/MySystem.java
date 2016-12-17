package com.test;

public class MySystem {
	  //动态属性
	public String name;
	//静态属性 
	public static MyOut out=new MyOut("李四");
	//构造
	public MySystem(String name){
		this.name=name;
	}
	//方法
	public void inro(){
		System.out.println(name+" 直接用类调用方法输出");
	}
	
	

	
}
