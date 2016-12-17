package com.test2;



/**
 *线程调度 
 */
public class Demo3 {
	/**
	 * 线程休眠
	 *     单线程休眠
	 */
	public void myThread1(){
		MyTask1 task1=new MyTask1();
		MyTask2 task2=new MyTask2();
		task1.run();
		task2.run();
	}
	/**
	 * 线程休眠  
	 * 		多线程切换
	 */
	public void myThread2(){
		
	}
	/**
	 * 线程让步
	 */
	public void myThread3(){
		
	}
	/*
	 * 线程插队
	 */
	public void myThread4(){
		
	}
}
class MyTask1 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "线程，i=" + i);
			//线程休眠
			if(i==4){
				System.out.println("线程休眠");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
class MyTask2 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int j = 0; j <10; j++) {
			System.out.println(name + "线程，j=" + j);
		}
	}
	
}
class MyTask3 implements Runnable{

	@Override
	public void run() {
		String name =Thread.currentThread().getName();
		for (int k = 0; k <10; k++) {
			System.out.println(name + "线程，k=" + k);
			if(k==4){
				System.out.println(name + "线程，作出让步 k=" + k);
				Thread.yield();
				System.out.println(name + "线程，让步之后代码");
			}
		}
	}
	
}
