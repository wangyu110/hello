package test4;

public class Animal {
	//����
	private String name;
	//����
	public Animal(String name){
		this.name=name;
	}
	//����
	public void eat(){
		System.out.println(name+"�Զ���");
	}
	//getter  setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
