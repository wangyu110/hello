package com.test3;

public class Outer2 {
	private int a;
	public Outer2(int a){
		this.a=a;
	}
	public void out(){
		System.out.println("a"+a);
		
	}
	
	//内部类为抽象类
	public abstract class Inner2{
		private int b;
		public Inner2(int b){
			this.b=b;
		}

		public abstract void in();

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
		
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
}
