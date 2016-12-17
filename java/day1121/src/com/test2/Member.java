package com.test2;

public class Member {
	//静态属性
	public static final String ROLE_GRANDMA="grandma";
	public static final String ROLE_MOTHER="mother";
	public static final String ROLE_BABY="baby";
	//属性   name  age role
	private String name="bull";
	private int age=0;
	private String role="";
	//构造
	public Member(){
		
	}
	public Member(String name, int age,String role) {
		super();
		this.name = name;
		this.age = age;
		this.role=role;
	}
	
	//方法
	public void getup(){
		System.out.println(name+"起床了");
	}
	public void work(){
		System.out.println(name+"工作了");
	}
	public void sleep(){
		System.out.println(name+"睡觉了");
	}
	public void play(){
		switch(role){
		case ROLE_GRANDMA:
			System.out.println(getName()+"遛鸟");
			break;
		case ROLE_MOTHER:
			System.out.println(getName()+"麻将");
			break;
		case ROLE_BABY:
			System.out.println(getName()+"我还是个孩子  我要睡觉");
			break;
			
		}
	}
	
	
	
	
	
	
	
	
	//gettet  setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
