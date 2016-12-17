package com.test2;

public class Student {
	/*
	 * 普通类组合普通类
	 */
	private String name;
	/*
	 * 可以组合抽象类
	 */
//	private Animal a1=null;
	/*
	 * 可以组合接口
	 */
//	private Holiday h1= null;
	
	private Animal a2=new Animal("旺财") {
		
		@Override
		public void sleep() {
			System.out.println(this.getName()+"睡觉");
			
		}
		
		@Override
		public void eat() {
			System.out.println(this.getName()+"吃骨头");
			
		}
	};
	private Holiday h2=new Holiday(){

		@Override
		public void week() {
			System.out.println(getName()+"休息2两天");
			
		}

		@Override
		public void year() {
			System.out.println(getName()+"休息两周");
			
		}
		
	};
	//构造
	public Student(){
		
	}
	public Student(String name){
		this.name=name;
	}
	
	//方法
	public void intro(){
		System.out.println("主人名："+name);
		System.out.println("宠物名"+a2.getName());
		
		a2.eat();
		a2.sleep();
		
		h2.week();
		h2.year();
	}
	public void work(){
		System.out.println(getName()+"学习");
	}
	public void sleep(){
		System.out.println(getName()+"休息了");
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
