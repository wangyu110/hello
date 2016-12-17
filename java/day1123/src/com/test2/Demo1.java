package com.test2;

public class Demo1 implements MyFace2 {
	/*
	 * 类实现接口关键字为implements 
	 * 类实现接口则要重写接口中的抽象方法
	 */
	//属性
	private String type;
	//构造
	public Demo1(){
		
	}
	public Demo1(String type){
		this.type=type;
	}
	//方法  
	
	
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(name+age+"实现接口中的方法");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(name+age+"实现接口中的方法");
	}
	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println(name1);
	}
	
	
}
