package com.test2;

public class Student {
	/*
	 * ��ͨ�������ͨ��
	 */
	private String name;
	/*
	 * ������ϳ�����
	 */
//	private Animal a1=null;
	/*
	 * ������Ͻӿ�
	 */
//	private Holiday h1= null;
	
	private Animal a2=new Animal("����") {
		
		@Override
		public void sleep() {
			System.out.println(this.getName()+"˯��");
			
		}
		
		@Override
		public void eat() {
			System.out.println(this.getName()+"�Թ�ͷ");
			
		}
	};
	private Holiday h2=new Holiday(){

		@Override
		public void week() {
			System.out.println(getName()+"��Ϣ2����");
			
		}

		@Override
		public void year() {
			System.out.println(getName()+"��Ϣ����");
			
		}
		
	};
	//����
	public Student(){
		
	}
	public Student(String name){
		this.name=name;
	}
	
	//����
	public void intro(){
		System.out.println("��������"+name);
		System.out.println("������"+a2.getName());
		
		a2.eat();
		a2.sleep();
		
		h2.week();
		h2.year();
	}
	public void work(){
		System.out.println(getName()+"ѧϰ");
	}
	public void sleep(){
		System.out.println(getName()+"��Ϣ��");
	}
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getA2() {
		return a2;
	}
	public void setA2(Animal a2) {
		this.a2 = a2;
	}
	public Holiday getH2() {
		return h2;
	}
	public void setH2(Holiday h2) {
		this.h2 = h2;
	}
	
	
	
}
