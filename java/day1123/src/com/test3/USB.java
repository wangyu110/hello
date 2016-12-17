package com.test3;

public interface USB {
	public static final String face="3.0";
	
	public abstract void out(String data);
	public abstract void in();
}
