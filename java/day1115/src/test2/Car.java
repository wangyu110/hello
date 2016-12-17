package test2;

public class Car {
	//静态变量
	public static int a=1;
	//静态常量
	public static final int b=2;
	//动态
	private int c;
	//构造
	public Car(){
		
	}
	public Car(int c){
		this.c=c;
	}
	//方法

	public void demo1(){
		int d=b+c;
		System.out.println(d);
	}
	public static void demo2(){
		System.out.println(b);
	}
}
