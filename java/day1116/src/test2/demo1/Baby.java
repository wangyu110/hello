package test2.demo1;
/**
 * baby��	���ԣ�����  ����
 * �������𴲣����������֣�˯����
 */
public class Baby {
	//����  
	private String name;
	private int age;
	
	//���췽��
	public Baby(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//����
	public void getup(){
		System.out.println(name+"����");
	}
	public void work() {
		System.out.println(getName() + ":���׶�԰��");
	}

	public void play() {

		System.out.println(getName() + ":�ڼ�����");
	}

	public void sleep() {

		System.out.println(getName() + ":˯����Ϣ");
	}

	//���ҽ���
	public void intro(){
		System.out.println("name:" + getName() + ",age:" + getAge());
	}
	
	
	
	
	
	
	
	
	
	
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
