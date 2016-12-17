package com.test2;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
//		demo1.test1();
//		demo1.test2();
//		demo1.test3();
//		demo1.test4();
//		demo1.test5();
		Demo2 demo2=new Demo2();
//		demo2.myFile1();
		demo2.myFile2(new File("H:/a1"), "");
	}
}
