package com.test2;

public class Baby extends Member{
	public Baby(String name,int age,String role){
		super(name,age,role);
	}
	public void work(){
		System.out.println("����"+getName()+"���꣺"+getAge()+"���Բ�����");
	}
}
