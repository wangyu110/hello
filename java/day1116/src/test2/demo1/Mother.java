package test2.demo1;
/**
 * �����ࡣ
 * 
 * ���ԣ����������䡣
 * 
 * �������𴲣����������֣�˯����
 * 
 */
public class Mother {
	// ����
	private String name = "";
	private int age = 0;

	// ����
	public Mother(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// ����
	public void getup() {

		System.out.println(getName() + ":����");
	}

	public void work() {
		System.out.println(getName() + ":����Ǯ");
	}

	public void play() {

		System.out.println(getName() + ":���Ϲ�û��Ϣ");
	}

	public void sleep() {

		System.out.println(getName() + ":˯����Ϣ");
	}
	
	//���ҽ���
	public void intro(){
		System.out.println("name:" + getName() + ",age:" + getAge());
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
