package com.demo;

import com.test1.Demo1;
import com.test1.Demo2;
import com.test1.Demo3;
import com.test2.Dog;
import com.test2.Student;
import com.test2.StudentHoliday;
import com.test3.Outer1;
import com.test3.Outer1.Inner1;
import com.test3.Outer2;
import com.test3.Outer4;
import com.test3.Outer5;
import com.test3.Outer2.Inner2;
import com.test3.Outer3.Inner3;
import com.test3.Outer4.Inner4;
import com.test3.Outer5.Inner5;
import com.test3.Outer6;
import com.test3.Outer6.Inner6;
import com.test3.Outer7.Inner7;

public class Test {

	public static void main(String[] args) {
		//������ĸ�������ǣ���ͨ��  ������ �ӿ�
		//�������ǽ�ʵ�ֹ��̺�new���̺϶�Ϊһ
//		Demo1 d1 = new Demo1("��ͨ��"){
//
//			@Override
//			public void test1() {
//				super.test1();
//				System.out.println("����д��ͨ���еķ���");
//			}
//			
//		};
//		d1.test1();
//		Demo2 d2 = new Demo2(1) {
//			
//			@Override
//			public void test2() {
//				System.out.println("����д�������еĳ��󷽷�");
//				
//			}
//		};
//		d2.test2();
//		Demo3 d3= new Demo3(){
//
//			@Override
//			public void test3() {
//				System.out.println("����д�ӿ��еĳ��󷽷�");
//			}
//			
//		};
//		System.out.println(d3.type);
//		d3.test3();
		
		//���   ����������    �������������    ����ӿڵ����
		Student s =new Student("����");
//		Dog d = new Dog("С����");
//		StudentHoliday sh= new StudentHoliday(s.getName());
//		s.setA2(d);
//		s.setH2(sh);
//		s.intro();
		
		//�ڲ���ֱ�Ϊ  ��ͨ�� ������  �ӿ�  
		Outer1 out1=new Outer1(1);
		Inner1 ini1=out1.new Inner1(1);
//		ini1.in();
			//��д----��ͨ
		Inner1 in1=new Outer1(1).new Inner1(1);
//		in1.in();
			//------����
		Outer2 out2=new Outer2(2);
		Inner2 ini2=out2.new Inner2(2){

			@Override
			public void in() {
				System.out.println("b:"+getB());
				
			}
			
		};
//		ini2.in();
		//��д------����
		Inner2 inner2=new Outer2(2).new Inner2(2){

			@Override
			public void in() {
				// TODO Auto-generated method stub
				System.out.println("b:"+getB());
			}
			
		};
//		ini2.in();
		//-----�ӿ��൱�ھ�̬   ����ֱ�ӶԽӿ�ʵ�־ͺ�
		Inner3 in3=new Inner3() {
			
			@Override
			public void in() {
				System.out.println("b"+b);
				
			}
		};
		in3.in();
		//-----�������е���ͨ��
		Inner4 in4=new Outer4("aaa") {
			
			@Override
			public void out() {
				System.out.println("a"+getA());
			}
		}.new Inner4("bb");
		in4.in();
		//------�ӿ��еĽӿ�
		Inner5 inner5=new Inner5() {
			
			@Override
			public void in() {
				System.out.println("b:"+b);
				
			}
		};
		inner5.in();
		//----�ӿ�����ͨ��
		Inner6 in6=new Outer6.Inner6("bb6");
		in6.in();
		
		//----�ӿ��г�����
		Inner7 in7=new Inner7("bbbb7") {
			
			@Override
			public void out() {
				System.out.println("b"+getB());
				
			}
		};
		in7.out();
	}

}
