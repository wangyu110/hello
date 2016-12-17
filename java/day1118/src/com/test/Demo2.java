package com.test;
/**
 * 组合：MySystem  >>MyOut(out)  >>  MyPrint(print)  
 */
public class Demo2 {
	public void test1(){
		
		System.out.println("直接输出");
		
		MySystem s=new MySystem("张三");
		s.inro();
		
//		s.out.myout();
		MySystem.out.myout();
		
//		s.out.print.myprint();
		
		MySystem.out.print.myprint();
		
	}
}
