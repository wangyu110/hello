package com.test2;

public class Member {
	//��̬����
	public static final String ROLE_GRANDMA="grandma";
	public static final String ROLE_MOTHER="mother";
	public static final String ROLE_BABY="baby";
	//����   name  age role
	private String name="bull";
	private int age=0;
	private String role="";
	//����
	public Member(){
		
	}
	public Member(String name, int age,String role) {
		super();
		this.name = name;
		this.age = age;
		this.role=role;
	}
	
	//����
	public void getup(){
		System.out.println(name+"����");
	}
	public void work(){
		System.out.println(name+"������");
	}
	public void sleep(){
		System.out.println(name+"˯����");
	}
	public void play(){
		switch(role){
		case ROLE_GRANDMA:
			System.out.println(getName()+"����");
			break;
		case ROLE_MOTHER:
			System.out.println(getName()+"�齫");
			break;
		case ROLE_BABY:
			System.out.println(getName()+"�һ��Ǹ�����  ��Ҫ˯��");
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
