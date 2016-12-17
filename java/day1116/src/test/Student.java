package test;
/**
 * 学生类：  属性：name gender math english chinese
 * 		    方法：intro total avg
 */
public class Student {
	//属性
	private String name;
	private String gender;
	private int math;
	private int english;
	private int chinese;
	//构造方法
	public Student(){
		
	}
	public Student(String name, String gender, int math, int english, int chinese) {
		super();
		this.name = name;
		this.gender = gender;
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	//方法
	//自我介绍方法
	public String myName(){
		String myName=name;
		return myName;
	}
	public String intro(){
		String intro="我叫"+name+",性别："+gender+"  数学成绩："
				+math+"  英语成绩："+english+"  语文成绩："+chinese;
		System.out.println(intro);
		return intro;
	}
	//总分方法
	public int total(){
		int total=math+english+chinese;
		return total;
	}
	//平均分方法
	public int avg(){
		int avg=total()/3;
		return avg;
	}
}
