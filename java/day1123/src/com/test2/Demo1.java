package com.test2;

public class Demo1 implements MyFace2 {
	/*
	 * ��ʵ�ֽӿڹؼ���Ϊimplements 
	 * ��ʵ�ֽӿ���Ҫ��д�ӿ��еĳ��󷽷�
	 */
	//����
	private String type;
	//����
	public Demo1(){
		
	}
	public Demo1(String type){
		this.type=type;
	}
	//����  
	
	
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(name+age+"ʵ�ֽӿ��еķ���");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(name+age+"ʵ�ֽӿ��еķ���");
	}
	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println(name1);
	}
	
	
}
