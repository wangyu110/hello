package com.test;
/**
 * ��ϣ�MySystem  >>MyOut(out)  >>  MyPrint(print)  
 */
public class Demo2 {
	public void test1(){
		
		System.out.println("ֱ�����");
		
		MySystem s=new MySystem("����");
		s.inro();
		
//		s.out.myout();
		MySystem.out.myout();
		
//		s.out.print.myprint();
		
		MySystem.out.print.myprint();
		
	}
}
