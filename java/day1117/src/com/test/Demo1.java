package com.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

/**
 *研究类：  String  StringBuffer 
 *		Math Roundom
 *		System 
 *	 	Date  Scanner
 *	
 */
public class Demo1 {
	//研究String类
	public void test1(){
		//split  拆分数组
		String a="ad,123,123,123";
		String arr[]=a.split(",");
		System.out.println(Arrays.toString(arr));
		String s1=new String();
		System.out.println("s1: "+s1);
		String s2=new String();
		s2="hello";
		System.out.println("s2: "+s2);
		String s3=new String("world");
		System.out.println("s3: "+s3);
		
		String s4=new String();
		s4=s2+s3;
		System.out.println("s4: "+s4);
		//concat  拼接
		String s5=s2.concat("小明");
		System.out.println(s5);
		//substring   子串
		String s6=s5.substring(0,3);
		System.out.println(s6);
		//charAt(index)  获取第index位置字符
		char s7=s5.charAt(1);
		System.out.println(s7);	
	}
	public void test2(){
		//equals()  比较内容   equalsIgnoreCase() 忽略大小写
		String s1="hello";
		String s2="hello";
		String s3="HELLO";
		
		boolean s4=s1.equals(s2);
		System.out.println(s4);
		
		boolean s5=s1.equals(s3);
		System.out.println(s5);
		
		boolean s6=s1.equalsIgnoreCase(s3);
		System.out.println(s6);
		
	}
	public void test3(){
		//start  end  是否以  开始结束
		String s1="hello";
		String s2="rello";
		String s3="hella";
		System.out.println(s1.startsWith("h"));
		System.out.println(s2.endsWith("o"));
		//contains  是否包含
		System.out.println(s1.contains("el"));
		//replace  替换
		System.out.println(s2.replace("r", "h"));
	}
	//研究Math类 
	public void test4(){
		//Math类中的方法
		int a=4;
		int b=5;
		int c=-6;
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(a));
		System.out.println(Math.abs(c));
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.pow(a, b));//a的b次方
		System.out.println(Math.ceil(4.1));//返回大值 进1
		System.out.println(Math.floor(4.9));//返回小值
		System.out.println(Math.round(2.5));//四舍五入
		System.out.println(Math.random());
		
	}
	public void test5(){
		//随机
		Random r=new Random();
		for (int i = 0; i < 10; i++) {
			int a=r.nextInt(10);
//			System.out.println("a:"+a);
		}
		//随机一次不变
		Random r2=new Random(1111);
		for (int i = 0; i < 10; i++) {
			int b=r2.nextInt(10);
//			System.out.println("b:"+b);
		}
		//system类  方法输出时间 
		long time=System.currentTimeMillis();
//		System.out.println(time);
		
		String pattern="yyyy-MM-dd hh:mm";
		
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String s=sdf.format(time);
		
//		System.out.println(s);
		
		Date d=new Date(time);
		
		System.out.println(d);
		Calendar c = Calendar.getInstance();
		
		System.out.println("day:" + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("day:" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("day:" + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("month:" + c.get(Calendar.MONTH));
		
	}
	public void test6(){
//		String string=new String("h");
		String s1="hello";
		System.out.println(s1.hashCode());
		s1+="world";
		System.out.println(s1.hashCode());
		System.out.println(s1+"world");
		System.out.println(s1);
		StringBuilder s2=new StringBuilder("hello");
		s2.append("world");
		System.out.println(s2);
	}
	public void test7()   
    {   
           String text = "" ;   
          
           long beginTime = System.currentTimeMillis();   
           for ( int i= 0 ;i< 10000 ;i++)   
                 text = text + i;   
           long endTime = System.currentTimeMillis(); 
           System.out.println(text.hashCode());
           System.out.println("执行时间：" +(endTime-beginTime));   

           StringBuilder sb = new StringBuilder ( "" );   
           beginTime = System.currentTimeMillis();   
           for ( int i= 0 ;i< 10000 ;i++)   
                  sb.append(String.valueOf(i));   
           endTime = System.currentTimeMillis();  
           System.out.println(sb.hashCode());
           System.out.println("执行时间：" +(endTime-beginTime));   

    }
	public void  test8(){
		Date d = new Date(0);
		System.out.println("time:" + d.getTime());
		Calendar c = Calendar.getInstance();
	}
	
}










