package com.test;


/**
 *���߳����г���
 */
public class Demo2 {
	/**
	 * ��ʱ����1
	 */
	public void myTest1(){
		int count=100;
		int i=0;
		while(i<count){
			String name= Thread.currentThread().getName();
			System.out.println(name + "�߳�:i=" + i);
			i++;
		}
	}
	/**
	 * ��ʱ����2
	 */
	public void myTest2(){
		int count=100;
		int j=0;
		while(j<count){
			String name= Thread.currentThread().getName();
			System.out.println(name + "�߳�:j=" + j);
			j++;
		}
	}
}
