package com.test;

public class MyClass1<E> {
	private String name;
	private E obj;
	public MyClass1(){
		
	}
	public MyClass1(String name, E obj) {
		super();
		this.name = name;
		this.obj = obj;
	}
	public void add(String name,E obj){
		System.out.println(name+obj);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public E getObj() {
		return obj;
	}
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	
}
