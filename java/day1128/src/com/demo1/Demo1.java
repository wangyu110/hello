package com.demo1;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Demo1 {
	/*
	 * 自定义异常
	 */
	public void test1() throws MyException{
		int a=10;
		int b=0;
		int c=0;
		
		if(c==0){
			throw new MyException("除数为0");
		}
		c=a/b;
		System.out.println(c);
	}
	/*
	 * 包装类
	 */
	public void test2(){
//		//基本类型
//		int a=10;
//		//复杂类型 包装类
//		Integer b=20;
//		Integer c1=new Integer(a);
//		Integer c2=new Integer(b);
//		
//		int c=c1+c2;
//		System.out.println(c);
		
		//装箱  拆箱
			//装
//		int e=10;
//		Integer e1=new Integer(e);
//		Integer e2=e;
//		System.out.println(e1+e2);
//			//拆
//		Integer f=new Integer(20);
//		int f1=f.intValue();		//手动拆箱
//		int f2=f;		//自动拆箱
//		System.out.println(f1+f2);
//		
//		//字节类型 byte
//		byte g=10;
//		Byte g1=new Byte((byte)10);// 装箱时需要强制转换为byte型   不然默认为int
//		
//		short h=20;
//		Short h1=new Short((short)20);
//		
//		int i=30;
//		Integer i1=new Integer(30);
//		
//		long j=40L;
//		Long j1=new Long(40L);
//		
//		float k=3.0f;
//		Float k1=new Float(3.0f);
//		
//		double l=4.0;
//		Double l1=new Double(4.0);
		
//		//研究复杂类型方法
//		int a=20;
//		Integer a1=new Integer(a);
//		System.out.println("转换为字符串:"+a1.toString());
//		System.out.println("比较asc码差值:"+a1.compareTo(21));
//		System.out.println("转换为二进制:"+Integer.toBinaryString(15));
//		System.out.println("转换为16进制:"+Integer.toHexString(15));
//		System.out.println("哈希吗:"+a1.hashCode());
//		Integer b1=Integer.valueOf(10);//int类型转换为Integer
//		
//		
		
		//String 类型
		StringBuilder s=new StringBuilder("abcde");
		System.out.println("哈希吗："+s.hashCode());
		System.out.println("添加："+s.append("f"));
		System.out.println("删除元素："+s.delete(0, 3));
		System.out.println("倒置："+s.reverse());

		
		
		
	}
}













