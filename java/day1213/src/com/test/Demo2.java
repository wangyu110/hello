package com.test;


/**
 *单线程运行程序
 */
public class Demo2 {
	/**
	 * 耗时操作1
	 */
	public void myTest1(){
		int count=100;
		int i=0;
		while(i<count){
			String name= Thread.currentThread().getName();
			System.out.println(name + "线程:i=" + i);
			i++;
		}
	}
	/**
	 * 耗时操作2
	 */
	public void myTest2(){
		int count=100;
		int j=0;
		while(j<count){
			String name= Thread.currentThread().getName();
			System.out.println(name + "线程:j=" + j);
			j++;
		}
	}
}
