package com.test2;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+"³Ô¹ÇÍ·");
		
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"Ë¯¾õ");
		
	}
	

}
