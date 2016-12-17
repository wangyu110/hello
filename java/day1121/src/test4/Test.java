package test4;

public class Test {
	public static void main(String[] args) {
		//多态引用指向本类对象
		Animal a1=new Animal("旺财");
		a1.eat();
		//多态引用指向子类对象
		Animal a2=new Dog("旺达");
		a2.eat();
	}
}