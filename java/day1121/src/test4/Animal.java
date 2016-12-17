package test4;

public class Animal {
	//属性
	private String name;
	//构造
	public Animal(String name){
		this.name=name;
	}
	//方法
	public void eat(){
		System.out.println(name+"吃东西");
	}
	//getter  setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
