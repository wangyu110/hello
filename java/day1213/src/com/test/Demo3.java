package com.test;


/**
 * �̳�Thread��
 */
public class Demo3 extends Thread {
	//��̳�Thread���ȱ�� ����ļ̳��ǵ��̳� �޷��ټ̳�������   
	//���������̴߳��뽻֯��һ��  ��������Զ���ı��˼ά
	@Override
	public void run() {
		
		int count=10;
		int i=0;
		while(i<count){
			String name =Thread.currentThread().getName();
			System.out.println(name + "�̣߳�i="+i);
			i++;
		}
	}
}
