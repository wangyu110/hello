package com.demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo1 {
	public void test1(){
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add(null);
		list.add(null);
		list.add("d");
		System.out.println(list);
		
	}
	public void test2(){

		HashSet<Student> hs=new HashSet<Student>();
		
		Student s1=new Student("a", 10);
		Student s2=new Student("b", 11);
		Student s3=new Student("c", 12);
		Student s4=new Student("d", 13);
		Student s5=new Student("e", 14);
		
		System.out.println(s3.equals(s4));
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(null);
		
		System.out.println(hs);
		
	}
	public void test3(){
		TreeSet<String> ts=new TreeSet<String>();
//		ts.add(null);//TreeSet中不能加null
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
//		System.out.println(ts);
		//student类要实现Comparable接口  否则会报错classcastexception
//		TreeSet<Student> ts2=new TreeSet<Student>();
		
		StudentComparable comparator=new StudentComparable();
		TreeSet<Student1> ts2=new TreeSet<Student1>(comparator);
		
//		Student s1=new Student("a",10);
//		Student s2=new Student("b",11);
//		Student s3=new Student("c",12);
//		Student s4=new Student("d",13);
//		Student s5=new Student("e",14);
		
		Student1 s1=new Student1("a",10);
		Student1 s2=new Student1("b",11);
		Student1 s3=new Student1("c",12);
		Student1 s4=new Student1("d",13);
		Student1 s5=new Student1("e",14);
	
		ts2.add(s1);
		ts2.add(s2);
		ts2.add(s3);
		ts2.add(s4);
		ts2.add(s5);
		System.out.println(ts2);
	}
	public void test4(){
		TreeSet<String> ts=new TreeSet<String>();
		
		String s1="我好";
		String s2="搭建好";
		String s3="你好";
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		System.out.println(ts);
		
	}
}
