package com.test3;

public class Mobile implements USB {
	private String name;
	@Override
	
	public void out(String data) {
		// TODO Auto-generated method stub
		System.out.println(data);
	}

	@Override
	public void in() {
		// TODO Auto-generated method stub
		System.out.println("in·½·¨");
	}


}
