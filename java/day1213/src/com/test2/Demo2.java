package com.test2;


/**
 *�߳����ȼ� 
 *
 */
public class Demo2 {
	/**
	 * �߳����ȼ�    ���ȼ��߲�����һ������ִ��  ����Ҫ������ϵͳ
	 */
	public void myThread1(){
		//����
		MyWork1 work1=new MyWork1();
		MyWork2 work2=new MyWork2();
		//�߳�
		Thread th1= new Thread(work1);
		Thread th2=new Thread(work2);
		//�߳�����
		th1.setName("aa");
		th2.setName("z     z");
		//�������ȼ�
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		//����
		th1.start();
		th2.start();
	}
}
class MyWork1 implements Runnable{

	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		for (int i = 0; i <10; i++) {
			System.out.println(name + "�߳� i=" + i);
		}
	}
	
}
class MyWork2 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int j = 0; j < 10; j++) {
			System.out.println(name + "�߳� j=" + j);
		}
	}
	
}




