package com.test2;

public class Test {

	public static void main(String[] args) {
		//简单的继承父类调用父类方法
		Mother m1=new Mother("张三", 40,"mother");
//		m1.getup();
		m1.play();
		//子类调用自己方法  调用父类方法
		Grandma g1=new Grandma("李四", 70, "grandma");
//		g1.intro();
//		g1.getup();
		g1.play();
		
		//子类重写父类方法
		Baby b1=new Baby("王五", 3,"baby");
//		b1.getup();
//		b1.work();
		b1.play();
		
		Family f1=new Family(g1, m1, b1);
		f1.daystar();
		f1.work();
		f1.dayend();
		
		
		
		
		

	}

}
