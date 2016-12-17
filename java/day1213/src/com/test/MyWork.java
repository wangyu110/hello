package com.test;

public class MyWork implements Runnable {
	private int tikets=100;
	public void sell(){
		String name = Thread.currentThread().getName();
		System.out.println(name + "线程售票"+tikets--);
	}
	@Override
	public void run() {
		while(true){
			if(tikets<=0){
				System.out.println("票卖完了");
				break;
			}
			sell();
		}
	}
	
}
