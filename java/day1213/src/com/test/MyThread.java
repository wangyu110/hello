package com.test;

public class MyThread extends Thread {
	private int tikets=100;
	public void sell(){
		String name = Thread.currentThread().getName();
		System.out.println(name+"�߳���Ʊ"+tikets--);
	}
	@Override
	public void run() {
		super.run();
		while(true){
			if(tikets<=0){
				System.out.println("Ʊ������");
				break;
			}
			sell();
		}
	}
}
