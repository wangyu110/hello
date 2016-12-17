package com.test1;

import javax.tools.Diagnostic;

import com.test1.Demo1.Demo2;

public class Test {

	public static void main(String[] args) {
		Demo1 d1=new Demo1("zhang", 12);
//		d1.test1();
		//通过外部类对象创建内部类对象
		
		//创建动态内部类的对象
		Demo2 d2=d1.new Demo2("male", 20);
		d2.test2();
		//<外部类类名>.<内部类类名> 引用变量 = new <外部类类名>.<内部类构造器>		
		//创建静态内部类对象
//		Demo1.Demo2 s=new Demo1.Demo2("mole", 12);
//		s.test2();
		
	}

}
