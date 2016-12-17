package com.test2;

public class Demo1 extends Thread {
	public Demo1(String name){
		super(name);
		System.out.println(name + "线程：新建状态");	
	}
	@Override
	public synchronized void start() {
		super.start();
		String name = getName();
		System.out.println(name + "就绪状态");
	}
	@Override
	public void run() {
		super.run();
		String name = Thread.currentThread().getName();
		for (int i = 0; i <10; i++) {
			System.out.println(name + "线程：运行状态");
			if (i == 5) {
				try {
					System.out.println(name + "线程：阻塞状态");
					Thread.sleep(3 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(name + "线程：死亡状态");
	}
	
}
