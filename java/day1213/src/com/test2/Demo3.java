package com.test2;



/**
 *�̵߳��� 
 */
public class Demo3 {
	/**
	 * �߳�����
	 *     ���߳�����
	 */
	public void myThread1(){
		MyTask1 task1=new MyTask1();
		MyTask2 task2=new MyTask2();
		task1.run();
		task2.run();
	}
	/**
	 * �߳�����  
	 * 		���߳��л�
	 */
	public void myThread2(){
		
	}
	/**
	 * �߳��ò�
	 */
	public void myThread3(){
		
	}
	/*
	 * �̲߳��
	 */
	public void myThread4(){
		
	}
}
class MyTask1 implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "�̣߳�i=" + i);
			//�߳�����
			if(i==4){
				System.out.println("�߳�����");
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
			System.out.println(name + "�̣߳�j=" + j);
		}
	}
	
}
class MyTask3 implements Runnable{

	@Override
	public void run() {
		String name =Thread.currentThread().getName();
		for (int k = 0; k <10; k++) {
			System.out.println(name + "�̣߳�k=" + k);
			if(k==4){
				System.out.println(name + "�̣߳������ò� k=" + k);
				Thread.yield();
				System.out.println(name + "�̣߳��ò�֮�����");
			}
		}
	}
	
}
