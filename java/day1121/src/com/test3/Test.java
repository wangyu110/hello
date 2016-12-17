package com.test3;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student("张三", 20);
		s1.toString();
		Student s2=new Student("张三", 20);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		s1.hashCode();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		boolean a=(s1.hashCode())==(s2.hashCode());
		System.out.println(a);
	}
}
