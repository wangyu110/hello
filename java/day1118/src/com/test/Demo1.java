package com.test;

import java.util.Calendar;
import java.util.Date;

/**
 * ×Ü½á£ºString StringBulider StringBuffer
 *      	Math Random 
 *      Stytem
 *      Date SimpleDateFormat   Calender
 *
 */
public class Demo1 {
	public void test1(){
		//ÊôÐÔ
		StringBuilder str1=new StringBuilder("hello");
		str1.append(" world");
		System.out.println(str1);
		System.out.println(str1.toString());
		Date d1=new Date();
		System.out.println(d1.getTime());
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		
		System.out.println(calendar.getWeekYear());
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));		
	}
	public void test2(){
		
	}
}
