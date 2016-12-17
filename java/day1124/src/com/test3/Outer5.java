package com.test3;
/*
 * 接口中内部类为普通类
 */
public interface Outer5 {
	String a="a";
	
	void out();
	
	public interface Inner5{
		String b="b";
		void in();
	}
}
