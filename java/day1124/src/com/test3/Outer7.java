package com.test3;

public interface Outer7 {
	String a="aaa7";
	void out();
	
	public abstract class Inner7{
		private String b;
		public Inner7(String b){
			this.b=b;
		}
		public abstract void out();
		public String getB() {
			return b;
		}
		public void setB(String b) {
			this.b = b;
		}
		
		
	}
}
