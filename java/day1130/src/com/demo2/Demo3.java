package com.demo2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Demo3 {
	//treeset放字符串
	public void test1(){
		TreeSet<String> ts1=new TreeSet<String>();
		String a1="a";
		String a2="b1";
		String a3="b2";
		String a4="c3";
		String a5="c2";
		String a6="c1";
		String a7="d4";
		String a8="d2";
		String a9="d3";
		ts1.add(a9);
		ts1.add(a8);
		ts1.add(a7);
		ts1.add(a6);
		ts1.add(a5);
		ts1.add(a4);
		ts1.add(a3);
		ts1.add(a2);
		ts1.add(a1);
		System.out.println(ts1);
		//截取
		Set<String> set=ts1.subSet("b1", "d3");
		System.out.println(set);
	}
	//比较LinkedList和TreeSet的添加 获取时间
		//在添加元素上  LinkedList比TreeSet要快
		//在获取元素上TreeSet要快
	public void test2(){
		LinkedList<String> list=new LinkedList<>();
		for (int i = 0; i < 10000; i++) {
			list.add("a"+i);
		}
		long start1=System.currentTimeMillis();
		for (int i = 0; i <1000000; i++) {
			list.add("b"+i);
		}
		long end1=System.currentTimeMillis();
		long time1=end1-start1;
		System.out.println("list-add-time1: "+time1);
		
		long start2=System.currentTimeMillis();
		for (int i = 0; i <10000; i++) {
			String s1=list.get(i);
			s1=null;
		}
		long end2=System.currentTimeMillis();
		long time2=end2-start2;
		System.out.println("list-get-time2: "+time2);	
	}
	
	
	
	public void test3(){
		TreeSet<String> tree=new TreeSet<>();
		for (int i = 0; i <10000; i++) {
			tree.add("c"+i);
		}
		long start1=System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			tree.add("d"+i);
			

		}
		long end1=System.currentTimeMillis();
		long time1=end1-start1;
		System.out.println("tree-add-time1: "+time1);
		
		long start2=System.currentTimeMillis();
		Iterator<String> it=tree.iterator();
		while(it.hasNext()){
			String s=it.next();
			s=null;
		}
		long end2=System.currentTimeMillis();
		long time2=end2-start2;
		System.out.println("tree-get-time2: "+time2);
	}
}





