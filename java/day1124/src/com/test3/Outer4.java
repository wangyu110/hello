package com.test3;
/*
 * 抽象类中的内部类为普通类
 */
public abstract class Outer4 {
	private String a;
	public Outer4(String a){
		this.a=a;
	}
	public abstract void out();
	public class Inner4{
		private String b;
		public Inner4(String b){
			this.b=b;
		}
		public void in(){
			System.out.println("b:"+b);
		}
		public String getB() {
			return b;
		}
		public void setB(String b) {
			this.b = b;
		}
		
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	
}
