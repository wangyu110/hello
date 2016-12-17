package com.demo1;

import java.util.Comparator;


public class StudentComparable implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.getAge()>o2.getAge()){
			return -1;
		}else if(o1.getAge()<o2.getAge()){
			return 1;
		}
		return 0;
	}




}
