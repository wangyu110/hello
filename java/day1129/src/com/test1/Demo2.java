package com.test1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class Demo2 {
	/**
	 * collection�ӿ�
	 * list�ӿ�
	 * ArrayList��
	 * LinkenList��
	 * 
	 * utility ����
	 */
	public void tset1(){
		//collection�ӿ�  �еĳ��÷���
		Collection c=null;//�ӿ���������
//		//���÷���
//			//��
//		c.add(e);
//		c.addAll(c);
//			//ɾ
//		c.remove(o);
//		c.removeAll(c);
//		
//		c.size();//��С
//		c.clear();//���
//		c.contains(o);//����
//		c.containsAll(c);
//		c.equals(o);//�Ƚ�
//		c.toArray();//��Ϊ����
//		c.isEmpty();//�Ƿ�Ϊ��
		
	}
	//List�ӿ�
	public void test2(){
		List<String> list=null;
		//list���÷���
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
//		list.indexOf(o);//�����±�ȡԪ��
//		list.subList(fromIndex, toIndex);//��ȡ	
	}
	/**
	 * ArrayList��
	 * 		��̬����
	 */
	public void test3(){
		//ArrayListʵ����
		//Ĭ������       Ĭ�ϳ�ʼֵ
		ArrayList<String> list1=new ArrayList<String>();
		//��������  Ĭ�ϳ�ʼֵ
		ArrayList<String> list2=new ArrayList<String>(50);
		//��һ�����еļ��ϣ�collection���ͣ�����list
		ArrayList<String> list3=new ArrayList<String>(5);
		ArrayList<String> list4=new ArrayList<String>(list3);
		
		//���÷���
		list1.add("aaa");
//		System.out.println(list1);
//		System.out.println("size: "+list1.size());
//		System.out.println("empty: "+list1.isEmpty());
//		System.out.println("contains: "+list1.contains(list1));
//		System.out.println("get: "+list1.get(0));
		
//		list1.add(0, "bbb");//��indexλ�����Ԫ��
//		System.out.println(list1);
		
//		ArrayList<String> list5=new ArrayList<String>();
//		list5.addAll(list1);//��������ӽ���һ������
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
//		list5.remove(0);//�Ƴ��±�λ��Ԫ��
//		list5.remove("a3");//�Ƴ���ͬԪ��
//		System.out.println(list5);
		
//		ArrayList<String> list6=new ArrayList<String>();
//		list6.add("a1");
//		list6.add("a2");
//		list6.add("a3");
//		list6.add("a4");
//		list5.removeAll(list6);//�Ƴ����һ�������д�����ͬ��Ԫ��
//		System.out.println(list5);
		
		list5.set(0, "aset");//�ı��±괦��Ԫ��
//		System.out.println(list5);
		list5.set(3, "aset3");
//		System.out.println(list5);
		
		String s=list5.get(0);//��ȡ�±�λ�õ�Ԫ��
//		System.out.println(s);
		
		int index=list5.indexOf("a2");//��ȡ��Ԫ��λ�õ��±�
//		System.out.println(index);
		
//		List list=list5.subList(0, 5);//��ȡָ��λ��Ԫ��
//		System.out.println(list);
		
		//�����帳ֵ
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i <5; i++) {
			list.add("b"+i);
		}
		System.out.println(list);
		
		String [] arr={"1","2","3","4","5"};
		//����伯��
		List<String> list6=Arrays.asList(arr);
		System.out.println(list6);
		//���ϱ�����
		String [] arr1=new String[list6.size()];
		list6.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
		
		ArrayList<String> list8=new ArrayList<String>(list6);
		System.out.println("list8:"+list8);
	}
	
	//LinkedList�ĳ��÷���	
	public void test4(){
		//ʵ����
		LinkedList<String> link1=new LinkedList<String>();
		//��ֵ
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
		//�޸�  ����
		link1.set(0, "cset1");
		link1.isEmpty();
		String string=link1.get(2);
//		System.out.println(link1);
//		System.out.println(string);
		
		link1.addFirst("first");//����λ�����
//		System.out.println(link1);
		link1.addLast("last");//��ĳλ�����
//		System.out.println(link1);
		String s1=link1.element();//��ȡ��Ԫ��
		String s2=link1.getFirst();//��ȡ��һ��Ԫ��
		String s3=link1.getLast();//��ȡ����λ�õ�Ԫ��
//		System.out.println(s1+"--"+s2+"--"+s3);
		link1.add("c2");
//		System.out.println(link1);
		int a1=link1.indexOf("c2");//��ȡ��Ԫ�صĵ�һ�γ���λ��
		int a2=link1.lastIndexOf("c4");//��ȡ��Ԫ�����һ�γ��ֵ�λ��
//		System.out.println(a1+"--"+a2);
		
		LinkedList<String> link3=new LinkedList<String>();
		link3.push("aaa");//ѹջ  �Ƚ����
		link3.push("bbb");
		link3.push("ccc");
//		System.out.println(link3);
		
//		link3.pop();//��ջ
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
		String s4=link1.peek();//����  ��һ��λ�õ����Ƴ�
		String s5=link1.poll();//���� ��һ��λ�ò��Ƴ�
		String s6=link1.poll();
		System.out.println(s4+"--"+s5+"--"+s6);	
	}
	//ArrayList��LinkedList�Ƚ�ʱ��
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









































