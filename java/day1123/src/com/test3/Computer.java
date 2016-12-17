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
		System.out.println("我是"+"牌子，今年已经"+age+"岁，连接到USB"+face+"传来的"+data);
	}

	@Override
	public void in() {
		// TODO Auto-generated method stub
		System.out.println("我是"+"牌子，今年已经"+age+"岁，连接到USB"+face+"传出");
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
