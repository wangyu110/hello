package com.test;


/**
 * ��ʶThread��
 */
public class Demo1 {
	/*
	 * �߳�����
	 */
	public void myThread1(){
		for (int i = 0; i <20; i++) {
			//��ӡ20��
			System.out.println("i="+i);
			//��ӡһ��    ����1��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * �߳���Ϣ
	 */
	public void myThread2(){
		//�߳�����
		String name=Thread.currentThread().getName();
		System.out.println("name:"+name);
		
		//�߳�ID
		long id=Thread.currentThread().getId();
		System.out.println("ID: "+id);
	}
}
