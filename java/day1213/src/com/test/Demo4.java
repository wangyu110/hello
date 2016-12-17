package com.test;


/**
 *实现Runnable接口
 */
public class Demo4 implements Runnable {

	@Override
	public void run() {
		int count =10;
		int i=0;
		while(i<count){
			String name = Thread.currentThread().getName();
			System.out.println(name + "线程：i"+i);
			i++;
		}
	}
	/*
	 * Thread类的缺点：（1）Java是单继承  继承Thread类 就无法继承其他类
	 * 				 （2）任务代码与线程代码交织在一起，不符合OOP基本思想
	 * 
	 * Runnable接口：
	 * 	（1）Runnable是接口，不影响实现类继承其他类的关系。
	 *  （2）任务代码和线程类分离，符合OOP基本思想。
	 */

}
