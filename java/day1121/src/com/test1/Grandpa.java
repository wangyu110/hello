package com.test1;

public class Grandpa {
	//����
	private String name;
	private int age;

	
	//����
	public Grandpa(){
		
	}
	public Grandpa(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//����
	public void eat(){
		System.out.println(name+" ,"+age+" �����");
	}
	public void work(){
		System.out.println(name+","+age+"  ��������");
	}
	//getter   setter
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
	
}
