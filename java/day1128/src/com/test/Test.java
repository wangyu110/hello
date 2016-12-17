package com.test;

import java.util.Arrays;

import com.demo1.Demo1;
import com.demo1.MyException;
import com.demo2.Demo2;
import com.demo2.Student;

public class Test {

	public static void main(String[] args) {
//		Demo1 d1=new Demo1();
//		try {
//			d1.test1();
//		} catch (MyException e) {
//			e.printStackTrace();
//			System.out.println("aaa");
//		}
//		d1.test2();
		
		//student类型的数组
//		Student[] arr= new Student[50];
//		Student[] arr2= new Student[50];
//		//打印数组
//		System.out.println("arr:"+Arrays.toString(arr));
//		
//		//为数组添加元素
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=new Student("zhang"+i, 20+i);
//		}
//		System.out.println("arr:"+Arrays.toString(arr));
//		
		
		//初始集合
		Demo2 d2=new Demo2();
		d2.test3();
		d2.test4();
		d2.test5();
		d2.test6();
		d2.test7("bcf");
		d2.test8("123456");
		
	}

}
