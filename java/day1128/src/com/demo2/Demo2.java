package com.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;

public class Demo2 {
	public void test1(){
		Collection c1 = null;
		c1.size();
		//增
//		c1.add(e);
		//删
//		c1.remove(o);
		//查   改  (无)
//		c1.set();   c1.get();
	}
	public void test2(){
		List list;
//		list.add(item);
//		list.remove(item);
//		list.get(index);
//		list.set(index, element);
//		list.size();
//		list.contains(o);
//		list.isEmpty();
//		list.clear();
	}
	public void test3(){
		ArrayList list=new ArrayList();
		String s1="aaaa";
		
		list.add(s1);
		
		Student s2=new Student("li", 30);
		list.add(s2);
		
		System.out.println("size:"+list.size());
		
		Student s3=(Student)list.get(1);
		System.out.println(s3);
		String s4=(String) list.get(0);
		System.out.println(s4);
		
	}
	public void test4(){
		ArrayList<String> list1=new ArrayList<String>();
		//String类型表明集合在放数据时为String类型
		for (int i = 0; i < 10; i++) {
			list1.add("a"+i);
		}
		System.out.println(list1);
		System.out.println(list1.get(4));
		
		ArrayList<Student> list2=new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student student=new Student("wang"+i, 10+i);
			list2.add(student);
		}
		System.out.println(list2);
		System.out.println(list2.get(5));
	}
	public void test5(){
		//数字和字符串之间的转换
			//数字转换为字符串
		int a=10;
		double b=1.1;
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		System.out.println(s1);
		System.out.println(s2);
			//字符串转换为数字
		String s3="04";
		byte b1=Byte.parseByte(s3);
		short b2=Short.parseShort(s3);
		int b3=Integer.parseInt(s3);
		long b4=Long.parseLong(s3);
		float b5=Float.parseFloat(s3);
		double b6=Double.parseDouble(s3);
		System.out.println("byte类型："+b1);
		System.out.println("short类型："+b2);
		System.out.println("int类型："+b3);
		System.out.println("long类型："+b4);
		System.out.println("float类型："+b5);
		System.out.println("double类型："+b6);
		
	}   
    public void test6(){
    	//字母與数字之间转换   asc码值之间转换
    	int a=97;
    	char s='a';
    	
    	char c1=(char)a;
    	System.out.println(c1);
    	int c2=(int)s;
    	System.out.println(c2);
    }
    public void test7(String input){
    	//数字与字母之间对应  a为1，b=2............
    	for (byte b : input.getBytes()) {
			System.out.println(b-96);
		}	
    }
    public void test8(String input){
    	for (byte b : input.getBytes()) {  
            System.out.print((char) (b + 48));  
        }
    }
	
}










