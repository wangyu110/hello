package com.test3;

public class Outer1 {
	private int a;
	
	public Outer1(int a){
		this.a=a;
	}
	
	public void out(){
		System.out.println("a:"+a);
	}
	
	//内部类为普通类
	public class Inner1{
		private int b;
		
		public Inner1(int b){
			this.b=b;
		}
		
		public void in(){
			System.out.println("a:"+a);
			System.out.println("b:"+b);
		}
	}
}
