package com.test2;

public class StudentHoliday implements Holiday {
	private String name = "";
//	Student s=new Student();
	public StudentHoliday(String name) {
//		name = s.getName();
		this.name=name;
	}
	@Override
	public void week() {
		System.out.println(name+"��Ϣ7��");
		
	}

	@Override
	public void year() {
		System.out.println(name+"��Ϣ7��");
		
	}

}
