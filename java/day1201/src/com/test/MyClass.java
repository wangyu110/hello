package com.test;
/*
 * ·ºÐÍ
 */
public class MyClass<T> {
	private String name;
	private T obj;
	public MyClass(){
		
	}
	public MyClass(String name,T obj){
		this.name=name;
		this.obj=obj;
	}
	
	public void add(String name,T obj){
		System.out.println(name+obj);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
