package com.test;


/**
 * 初识Thread类
 */
public class Demo1 {
	/*
	 * 线程休眠
	 */
	public void myThread1(){
		for (int i = 0; i <20; i++) {
			//打印20遍
			System.out.println("i="+i);
			//打印一遍    休眠1秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 线程信息
	 */
	public void myThread2(){
		//线程名字
		String name=Thread.currentThread().getName();
		System.out.println("name:"+name);
		
		//线程ID
		long id=Thread.currentThread().getId();
		System.out.println("ID: "+id);
	}
}
