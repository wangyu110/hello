package com.test2;

public class Demo {
	//对象调用方法
	public void test1(){
		A a=new A("hahah");
		a.a1();
	}
	//类调用静态属性来调用方法
	public void test2(){
		A.out.myout();
	}
	public void test3(){
		A.out.put.myput();
	}
	
}
