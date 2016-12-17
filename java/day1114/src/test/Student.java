package test;

public class Student {
	private String name;//姓名
	private double score;//成绩
	//获取姓名
	public String getName() {
	return name;
	}
	//设置姓名
	public void setName(String name) {
	this.name = name;
	}
	//获取成绩
	public double getScore() {
	return score;
	}
	//设置成绩
	public void setScore(double score) {
	this.score = score;
	}
	//无参数构造方法
	public Student() {
	super();
	}
	public Student(String name, double score) {
	super();
	this.name = name;
	this.score = score;
	}
}
