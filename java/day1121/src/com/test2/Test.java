package com.test2;

public class Test {

	public static void main(String[] args) {
		//�򵥵ļ̳и�����ø��෽��
		Mother m1=new Mother("����", 40,"mother");
//		m1.getup();
		m1.play();
		//��������Լ�����  ���ø��෽��
		Grandma g1=new Grandma("����", 70, "grandma");
//		g1.intro();
//		g1.getup();
		g1.play();
		
		//������д���෽��
		Baby b1=new Baby("����", 3,"baby");
//		b1.getup();
//		b1.work();
		b1.play();
		
		Family f1=new Family(g1, m1, b1);
		f1.daystar();
		f1.work();
		f1.dayend();
		
		
		
		
		

	}

}
