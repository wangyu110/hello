package test;
/**
 *创建类：Student
 *属性 name age
 *构造方法  无参  有参
 */
public class Student {
	private String name;
	private int age;
	private int score;//封装
	private String gender;
	public Student(){
		System.out.println("无参的构造方法");
	}
	public Student(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("我叫"+name+"今年："+age+"岁");
	}
	public void inf(){
		System.out.println(name+age);
	}
	//getter setter
	
	//获取成绩
	public int getScore() {
		return score;
	}
	//建立成绩
	public void setScore(int score) {
		this.score = score;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
	
}
