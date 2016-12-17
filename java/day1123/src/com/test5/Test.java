package com.test5;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Test {

	public static void main(String[] args) {
		int a1=20;
		//创建integer类型
		Integer a2=new Integer(a1);
		//integer类型转换double类型
		double a3=a2.doubleValue();
		//integer类型转换为float
		float a4=a2.floatValue();
		//integer类型转换为int类型
		int a5=a2.intValue();
		
		System.out.println(a2.toString());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		
	//装箱 
		double e=1.23;
		//手动装箱
		Double e1=new Double(e);
		//自动装箱
		Double e2=e;
		System.out.println("手动装箱："+e1+"自动装箱："+e2);
	//拆箱
		Double f=new Double(2.34);
		//手动拆箱
		double f1=f.doubleValue();
		//自动拆箱
		double f2=f1;
		System.out.println("手动拆箱"+f1+"自动拆箱："+f2);
		
		//Java 中基本类型和字符串之间的转换
		/*
		 *  使用包装类的 toString() 
		 *  方法使用String类的 valueOf() 
		 *  方法用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串
		 */
		int g=10;
		String g1=Integer.toString(g);
		String g2=String.valueOf(g);
		String g3=g+"";
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		
		/*
		 * 将字符串转换为基本类型的两种方法
		 * 1、调用包装类的 parseXxx 静态方法
		 * 2、调用包装类的 valueOf() 方法转换为基本类型的包装类，会自动拆箱
		 */
		
		String h="81";
		int h1=Integer.parseInt(h);
		int h2=Integer.valueOf(h);
		
	}
	
	
	

}
