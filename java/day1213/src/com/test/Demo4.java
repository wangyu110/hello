package com.test;


/**
 *ʵ��Runnable�ӿ�
 */
public class Demo4 implements Runnable {

	@Override
	public void run() {
		int count =10;
		int i=0;
		while(i<count){
			String name = Thread.currentThread().getName();
			System.out.println(name + "�̣߳�i"+i);
			i++;
		}
	}
	/*
	 * Thread���ȱ�㣺��1��Java�ǵ��̳�  �̳�Thread�� ���޷��̳�������
	 * 				 ��2������������̴߳��뽻֯��һ�𣬲�����OOP����˼��
	 * 
	 * Runnable�ӿڣ�
	 * 	��1��Runnable�ǽӿڣ���Ӱ��ʵ����̳�������Ĺ�ϵ��
	 *  ��2�����������߳�����룬����OOP����˼�롣
	 */

}
