package com.test1;

import com.test2.Demo1;
import com.test3.Computer;
import com.test3.Mobile;
import com.test4.Animal;
import com.test4.Dog;
import com.test4.MyDog;

public class Test {

	public static void main(String[] args) {
		//�ӿ�1�̳нӿ�2  Demo1��ʵ�����ӿ�
//		Demo1 d1=new Demo1();
//		d1.test1();
//		d1.test2();
//		d1.test3();
//		System.out.println(d1.name);
//		System.out.println(d1.age);
		
//		Computer c= new Computer();
//		Mobile m= new Mobile();
//		c.out("haha");
//		c.in();
//		m.out("hello");
//		m.in();
//		System.out.println(m.face);
		
		
		Animal a1=new Animal("����");
		Animal a2=new Dog("����");
		Animal a3=new MyDog("����");
		a1.eat();
		a2.eat();
		a3.eat();
		a1.sleep();
		a2.sleep();
		a3.sleep();
		//���ഴ���������ʵ��  ��ʵ��ֻ�ܵ��ù�ͬ�ķ���
		

	}

}
