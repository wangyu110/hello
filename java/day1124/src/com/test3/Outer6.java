package com.test3;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public interface Outer6 {
	String a="a";
	void out();
	
	public class Inner6{
		private String b;
		public Inner6(String b){
			this.b=b;
		}
		public void in(){
			System.out.println("b:"+b);
		}
	}
}
