package com.test3;

public class Boos {
	//����
	private String name;
	
	//����Ķ���
	private static Boos boos=null;
	//����
	private Boos(String name){
		this.name=name;
	}
	//����
	public void eat(){
		System.out.println(name+"������");
	}
	public static Boos getboos(String name){
		if(boos==null){
			boos=new Boos(name);
		}
		
		return boos;
	}
	
}
