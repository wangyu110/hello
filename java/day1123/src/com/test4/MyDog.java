package com.test4;

public class MyDog extends Dog{

	public MyDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void watch(){
		System.out.println(getName()+"����");
	}
	public void eat(){
		System.out.println(getName()+"�ӹ�ͷ");
	}

}
