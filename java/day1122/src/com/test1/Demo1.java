package com.test1;

public class Demo1 {
	//����
	private static String name;
	public int age;
	//����
	public Demo1(String name,int age){
		this.name=name;
		this.age=age;
	}
	//����
	public void test1(){
		System.out.println("�ⲿ�ද̬����"+name+age);
	}
	//��̬����
	public static void test3(){
		System.out.println("�ⲿ�ྲ̬����");
	}
	//�ڲ���
	public class Demo2{
		//����
		private String  gender;
		public  int b;
		//����
		public Demo2(String gender,int b){
			this.gender=gender;
			this.b=b;
		}
		//����
		public void test2(){
			System.out.println("�ڲ���Ķ�̬����"+gender+b);
		}
		//��̬�ڲ����в���д��̬���Ժ;�̬����
	}
	
}
