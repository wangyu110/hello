package com.test2;

public interface MyFace2 extends MyFace1 {
	/*
	 * 接口中 不能构造方法   属性只能public static final，即是常量
	 * 
	 * 方法为抽象方法  public abstract 
	 */
	
	//属性
	public static final String name="接口2";
	//若没有写public static final，那么系统将默认已填
	int age=20;
	
	//不能构造方法，  接口中方法为抽象方法
	public abstract void test1();
	//若方法没有写public abstract 则默认已填写
	void test2();
}
