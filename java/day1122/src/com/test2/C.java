package com.test2;

public class C extends B {

	public C(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println(c);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int c =a/b;
		System.out.println(c);
	}

	@Override
	public void add() {
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println(c);
	}

}
