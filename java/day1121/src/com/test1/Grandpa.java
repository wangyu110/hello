package com.test1;

public class Grandpa {
	//属性
	private String name;
	private int age;

	
	//构造
	public Grandpa(){
		
	}
	public Grandpa(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//方法
	public void eat(){
		System.out.println(name+" ,"+age+" 吃飯中");
	}
	public void work(){
		System.out.println(name+","+age+"  工作很累");
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
