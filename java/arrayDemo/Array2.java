package arrayDemo;
import java.util.Scanner;
public class Array2 {
	static String name;
	static int age;
	static char sex;
	static double height;
	static String type;
	public static void main(String[] args) {
		input();
		System.out.println("��Һã��ҽ�"+name+",�ҽ���"+age+"�꣬"+"�Ա�"+sex+",����ߣ�"+height+",���Ը�"+type);
		feeling("�������꣬������");
		input();
		System.out.println("��Һã��ҽ�"+name+",�ҽ���"+age+"�꣬"+"�Ա�"+sex+",����ߣ�"+height+",���Ը�"+type);
		feeling("��������ܿ���");
	}
	private static void feeling(String feel) {
		System.out.println(feel);
	}
	public static void input(){
		Scanner sca=new Scanner(System.in);
		System.out.println("����");
		name=sca.next();
		System.out.println("����");
		age=sca.nextInt();
		System.out.println("�Ա�");
		sex=sca.next().charAt(0);
		System.out.println("���");
		height=sca.nextDouble();
		System.out.println("�Ը�");
		type=sca.next();
		
	}
}
