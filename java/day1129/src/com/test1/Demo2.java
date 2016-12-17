package com.test1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class Demo2 {
	/**
	 * collection接口
	 * list接口
	 * ArrayList类
	 * LinkenList类
	 * 
	 * utility 工具
	 */
	public void tset1(){
		//collection接口  中的常用方法
		Collection c=null;//接口声明对象
//		//常用方法
//			//增
//		c.add(e);
//		c.addAll(c);
//			//删
//		c.remove(o);
//		c.removeAll(c);
//		
//		c.size();//大小
//		c.clear();//清除
//		c.contains(o);//包含
//		c.containsAll(c);
//		c.equals(o);//比较
//		c.toArray();//变为数组
//		c.isEmpty();//是否为空
		
	}
	//List接口
	public void test2(){
		List<String> list=null;
		//list常用方法
//		list.add(e);
//		list.remove(o);
//		list.get(index);
//		list.set(index, element);
//		
//		list.size();
//		list.isEmpty();
//		list.clear();
//		list.contains(o);
//		list.toArray();
//		
//		list.indexOf(o);//根据下标取元素
//		list.subList(fromIndex, toIndex);//截取	
	}
	/**
	 * ArrayList类
	 * 		动态数组
	 */
	public void test3(){
		//ArrayList实例化
		//默认容量       默认初始值
		ArrayList<String> list1=new ArrayList<String>();
		//给定容量  默认初始值
		ArrayList<String> list2=new ArrayList<String>(50);
		//用一个已有的集合（collection类型）创建list
		ArrayList<String> list3=new ArrayList<String>(5);
		ArrayList<String> list4=new ArrayList<String>(list3);
		
		//常用方法
		list1.add("aaa");
//		System.out.println(list1);
//		System.out.println("size: "+list1.size());
//		System.out.println("empty: "+list1.isEmpty());
//		System.out.println("contains: "+list1.contains(list1));
//		System.out.println("get: "+list1.get(0));
		
//		list1.add(0, "bbb");//从index位置添加元素
//		System.out.println(list1);
		
//		ArrayList<String> list5=new ArrayList<String>();
//		list5.addAll(list1);//将集合添加进另一个集合
//		System.out.println(list5);
//		
//		for (int i = 0; i < 10; i++) {
//			list1.add("aaa"+i);
//		}
//		System.out.println(list1);
		
//		list1.clear();
//		System.out.println(list1);
		
		ArrayList<String> list5=new ArrayList<String>();
		for (int i = 0; i < 6; i++) {
			list5.add("a"+i);
		}
		list5.add("a3");
		list5.add("a1");
		list5.add("a2");
		list5.add("a1");
//		System.out.println(list5);
//		list5.remove(0);//移除下标位置元素
//		list5.remove("a3");//移除相同元素
//		System.out.println(list5);
		
//		ArrayList<String> list6=new ArrayList<String>();
//		list6.add("a1");
//		list6.add("a2");
//		list6.add("a3");
//		list6.add("a4");
//		list5.removeAll(list6);//移除另个一个数组中存在相同的元素
//		System.out.println(list5);
		
		list5.set(0, "aset");//改变下标处的元素
//		System.out.println(list5);
		list5.set(3, "aset3");
//		System.out.println(list5);
		
		String s=list5.get(0);//获取下标位置的元素
//		System.out.println(s);
		
		int index=list5.indexOf("a2");//获取该元素位置的下标
//		System.out.println(index);
		
//		List list=list5.subList(0, 5);//截取指定位置元素
//		System.out.println(list);
		
		//给整体赋值
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i <5; i++) {
			list.add("b"+i);
		}
		System.out.println(list);
		
		String [] arr={"1","2","3","4","5"};
		//数组变集合
		List<String> list6=Arrays.asList(arr);
		System.out.println(list6);
		//集合变数组
		String [] arr1=new String[list6.size()];
		list6.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
		
		ArrayList<String> list8=new ArrayList<String>(list6);
		System.out.println("list8:"+list8);
	}
	
	//LinkedList的常用方法	
	public void test4(){
		//实例化
		LinkedList<String> link1=new LinkedList<String>();
		//赋值
		for (int i = 0; i <5; i++) {
			link1.add("c"+i);
		}
		link1.add("c4");
		link1.add("c4");
		link1.add("c4");
//		System.out.println(link1);
		

		
		ArrayList<String> list1=new ArrayList<String>(link1);
//		System.out.println(list1);
		LinkedList<String> link2=new LinkedList<String>(list1);
//		System.out.println(link2);
		
		link1.remove(0);
//		System.out.println(link1);
		link1.remove("c1");
//		System.out.println(link1);
		
		link1.removeFirst();
		link1.removeLast();
//		System.out.println(link1);
		//修改  查找
		link1.set(0, "cset1");
		link1.isEmpty();
		String string=link1.get(2);
//		System.out.println(link1);
//		System.out.println(string);
		
		link1.addFirst("first");//在首位置添加
//		System.out.println(link1);
		link1.addLast("last");//在某位置添加
//		System.out.println(link1);
		String s1=link1.element();//获取首元素
		String s2=link1.getFirst();//获取第一个元素
		String s3=link1.getLast();//获取最后的位置的元素
//		System.out.println(s1+"--"+s2+"--"+s3);
		link1.add("c2");
//		System.out.println(link1);
		int a1=link1.indexOf("c2");//获取该元素的第一次出现位置
		int a2=link1.lastIndexOf("c4");//获取该元素最后一次出现的位置
//		System.out.println(a1+"--"+a2);
		
		LinkedList<String> link3=new LinkedList<String>();
		link3.push("aaa");//压栈  先进后出
		link3.push("bbb");
		link3.push("ccc");
//		System.out.println(link3);
		
//		link3.pop();//出栈
//		link3.pop();
//		link3.pop();
//		System.out.println(link3);
//		System.out.println(link1.size());
		
//		int j=link1.size();
//		for (int i = 0; i <j; i++) {
//			String string2=link1.pop();
//			System.out.println(string2);
//		}
//		
		String s4=link1.peek();//检索  第一个位置但不移除
		String s5=link1.poll();//检索 第一个位置并移除
		String s6=link1.poll();
		System.out.println(s4+"--"+s5+"--"+s6);	
	}
	//ArrayList与LinkedList比较时间
	public void test5(){
		ArrayList<String> list=new ArrayList<String>();
		LinkedList<String> link=new LinkedList<String>();
		
		for (int i = 0; i < 5; i++) {
			String s="a"+i;
			list.add(s);
			link.add(s);
		}
		System.out.println(list);
		System.out.println(link);
	}
}









































