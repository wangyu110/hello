package com.test2;


/**
 *线程优先级 
 *
 */
public class Demo2 {
	/**
	 * 线程优先级    优先级高不代表一定优先执行  还是要看操作系统
	 */
	public void myThread1(){
		//任务
		MyWork1 work1=new MyWork1();
		MyWork2 work2=new MyWork2();
		//线程
		Thread th1= new Thread(work1);
		Thread th2=new Thread(work2);
		//线程名字
		th1.setName("aa");
		th2.setName("z     z");
		//设置优先级
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		//运行
		th1.start();
		th2.start();
	}
}
class MyWork1 implements Runnable{

	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		for (int i = 0; i <10; i++) {
			System.out.println(name + "线程 i=" + i);
		}
	}
	
}
class MyWork2 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int j = 0; j < 10; j++) {
			System.out.println(name + "线程 j=" + j);
		}
	}
	
}




