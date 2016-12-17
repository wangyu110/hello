package com.test;

public class Test {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
//		d1.myThread1();
//		d1.myThread2();
		Demo2 d2 =new Demo2();
//		d2.myTest1();
//		d2.myTest2();
		Demo3 d3 = new Demo3();
		Thread th1=new Thread(d3);
		Thread th2=new Thread(d3);
//		d3.start();
//		th1.start();
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		MyThread mt4 = new MyThread();
//		mt1.start();
//		mt2.start();
//		mt3.start();
//		mt4.start();
		MyWork mw1=new MyWork();
		Thread th11= new Thread(mw1);
		Thread th12= new Thread(mw1);
		Thread th13= new Thread(mw1);
		Thread th14= new Thread(mw1);
		th11.start();
		th12.start();
		th13.start();
		th14.start();
		
		
		
	}
	
}

