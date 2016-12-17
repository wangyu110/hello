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
		System.out.println("大家好，我叫"+name+",我今年"+age+"岁，"+"性别："+sex+",我身高："+height+",我性格："+type);
		feeling("今天下雨，不开心");
		input();
		System.out.println("大家好，我叫"+name+",我今年"+age+"岁，"+"性别："+sex+",我身高："+height+",我性格："+type);
		feeling("今天下雨很开心");
	}
	private static void feeling(String feel) {
		System.out.println(feel);
	}
	public static void input(){
		Scanner sca=new Scanner(System.in);
		System.out.println("姓名");
		name=sca.next();
		System.out.println("年龄");
		age=sca.nextInt();
		System.out.println("性别");
		sex=sca.next().charAt(0);
		System.out.println("身高");
		height=sca.nextDouble();
		System.out.println("性格");
		type=sca.next();
		
	}
}
