package test2;

public class Car {
	//��̬����
	public static int a=1;
	//��̬����
	public static final int b=2;
	//��̬
	private int c;
	//����
	public Car(){
		
	}
	public Car(int c){
		this.c=c;
	}
	//����

	public void demo1(){
		int d=b+c;
		System.out.println(d);
	}
	public static void demo2(){
		System.out.println(b);
	}
}
