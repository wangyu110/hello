package com.test2;

public class Demo1 extends Thread {
	public Demo1(String name){
		super(name);
		System.out.println(name + "�̣߳��½�״̬");	
	}
	@Override
	public synchronized void start() {
		super.start();
		String name = getName();
		System.out.println(name + "����״̬");
	}
	@Override
	public void run() {
		super.run();
		String name = Thread.currentThread().getName();
		for (int i = 0; i <10; i++) {
			System.out.println(name + "�̣߳�����״̬");
			if (i == 5) {
				try {
					System.out.println(name + "�̣߳�����״̬");
					Thread.sleep(3 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(name + "�̣߳�����״̬");
	}
	
}
