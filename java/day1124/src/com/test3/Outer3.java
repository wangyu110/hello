package com.test3;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Outer3 {
	private String a;
	public Outer3(String a) {
		this.a=a;
	}
	public void out(){
		System.out.println("a:"+a);
	}
	
	//�ڲ���Ϊ�ӿ�
	public interface Inner3{
		String b="3";
		void in();
	}
}
