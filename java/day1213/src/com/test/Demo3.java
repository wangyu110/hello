package com.test;


/**
 * 继承Thread类
 */
public class Demo3 extends Thread {
	//类继承Thread类的缺点 ：类的继承是单继承 无法再继承其他类   
	//任务代码和线程代码交织在一起  不符合面对对象的编程思维
	@Override
	public void run() {
		
		int count=10;
		int i=0;
		while(i<count){
			String name =Thread.currentThread().getName();
			System.out.println(name + "线程：i="+i);
			i++;
		}
	}
}
