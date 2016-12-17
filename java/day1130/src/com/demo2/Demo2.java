package com.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.demo1.Student;

import java.util.Map.Entry;

public class Demo2 {
	//HashMap简单研究
	public void test1(){
		HashMap<Integer, String> map=new HashMap<>();
//		map.put(1, "a");
//		map.put(2, "a");
//		map.get(1);
//		map.remove(1);
//		System.out.println(map);
//		System.out.println(map.keySet());
		
		String s1="a";
		String s2="b";
		String s3="c";
		String s4="d";
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put(null,"e");
		map.put(5, null);
//		System.out.println(map);
		
		//拿所有key
		Set<Integer> integers=map.keySet();
		for (Integer key : integers) {
			String v=map.get(key);
//			System.out.println(v);
//			System.out.println(key);
		}
		//拿所有values
		Collection<String> value=map.values();
		for (String v : value) {
//			System.out.println(v);
		}
		
		Set<Entry<Integer,String>> entrys=map.entrySet();
		for (Entry<Integer, String> entry : entrys) {
			Integer key=entry.getKey();
			String values=entry.getValue();
//			System.out.println(key+"-"+values);
		}
		
		HashMap<Integer, Student> map2=new HashMap<Integer,Student>();
		Student ss1 = new Student("a", 20);
		Student ss2 = new Student("b", 21);
		Student ss3 = new Student("c", 22);
		Student ss4 = new Student("d", 23);
		
		map2.put(2, ss4);
		map2.put(1, ss3);
		map2.put(4, ss1);
		map2.put(3, ss2);
		map2.put(5, ss2);
		map2.put(5, ss1);//key相同  覆盖上一个key
//		System.out.println(map2);
		
		
		
	}
	public void test2(){
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(3,"b");
		map.put(4,"a");
		map.put(1,"c");
		map.put(2,"d");
//		System.out.println(map);
		
		TreeMap<Integer, Student> map2=new TreeMap<Integer,Student>();
		Student s1 = new Student("a", 20);
		Student s2 = new Student("b", 21);
		Student s3 = new Student("c", 22);
		Student s4 = new Student("d", 23);
		
		map2.put(2, s2);
		map2.put(1, s1);
		map2.put(3, s3);
		map2.put(4, s4);
		
		System.out.println(map2);
		map2.keySet();
		map2.values();
		map2.entrySet();
		
		//拿key
		Set<Integer> integers=map2.keySet();
//		System.out.println(integers);
		for (Integer key : integers) {
			String vString=map.get(key);
//			System.out.println(vString);
		}
		//拿values
		Collection<String> collection=map.values();
		for (String v : collection) {
//			System.out.println(v);
		}
		//entry
		Set<Entry<Integer, String>> entrys=map.entrySet();
		for (Entry<Integer, String> entry : entrys) {
			Integer key=entry.getKey();
			String values=entry.getValue();
//			System.out.println(key+"-"+values);
		}
		
		
		
	}
}








