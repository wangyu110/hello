package com.test3;

public class Computer implements USB {
	private String brand;
	private int age;
	
	public Computer(){
		
	}
	public Computer(String brand, int age) {
		super();
		this.brand = brand;
		this.age = age;
	}


	@Override
	public void out(String data) {
		// TODO Auto-generated method stub
		System.out.println("����"+"���ӣ������Ѿ�"+age+"�꣬���ӵ�USB"+face+"������"+data);
	}

	@Override
	public void in() {
		// TODO Auto-generated method stub
		System.out.println("����"+"���ӣ������Ѿ�"+age+"�꣬���ӵ�USB"+face+"����");
	}




	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
