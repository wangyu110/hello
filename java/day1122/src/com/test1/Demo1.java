package com.test1;

public class Demo1 {
	//属性
	private static String name;
	public int age;
	//构造
	public Demo1(String name,int age){
		this.name=name;
		this.age=age;
	}
	//方法
	public void test1(){
		System.out.println("外部类动态方法"+name+age);
	}
	//静态方法
	public static void test3(){
		System.out.println("外部类静态方法");
	}
	//内部类
	public class Demo2{
		//属性
		private String  gender;
		public  int b;
		//构造
		public Demo2(String gender,int b){
			this.gender=gender;
			this.b=b;
		}
		//方法
		public void test2(){
			System.out.println("内部类的动态方法"+gender+b);
		}
		//动态内部类中不能写静态属性和静态方法
	}
	
}
