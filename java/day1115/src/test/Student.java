package test;
/**
 *�����ࣺStudent
 *���� name age
 *���췽��  �޲�  �в�
 */
public class Student {
	private String name;
	private int age;
	private int score;//��װ
	private String gender;
	public Student(){
		System.out.println("�޲εĹ��췽��");
	}
	public Student(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("�ҽ�"+name+"���꣺"+age+"��");
	}
	public void inf(){
		System.out.println(name+age);
	}
	//getter setter
	
	//��ȡ�ɼ�
	public int getScore() {
		return score;
	}
	//�����ɼ�
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
