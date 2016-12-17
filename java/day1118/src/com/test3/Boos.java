package com.test3;

public class Boos {
	//属性
	private String name;
	
	//本类的对象
	private static Boos boos=null;
	//构造
	private Boos(String name){
		this.name=name;
	}
	//方法
	public void eat(){
		System.out.println(name+"吃了吗");
	}
	public static Boos getboos(String name){
		if(boos==null){
			boos=new Boos(name);
		}
		
		return boos;
	}
	
}
