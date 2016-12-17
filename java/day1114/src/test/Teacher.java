package test;

public class Teacher {
	String name;//姓名
	int age;    //年龄

	//获取姓名
	public String getName(){
		return name;
	}
	//设置姓名
	public void setName(String name){
		this.name=name;
	}
	//获取年龄
	public int getAge(){
		return age;
	}
    //设置年龄
	public void setAge(int age){
		this.age=age;
	}
	//无参构造方法
	public Teacher(){
		super();
	}
	//两个参数构造方法为属性赋初始值
	public Teacher(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	
}
