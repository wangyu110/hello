package test;

public class Teacher {
	String name;//����
	int age;    //����

	//��ȡ����
	public String getName(){
		return name;
	}
	//��������
	public void setName(String name){
		this.name=name;
	}
	//��ȡ����
	public int getAge(){
		return age;
	}
    //��������
	public void setAge(int age){
		this.age=age;
	}
	//�޲ι��췽��
	public Teacher(){
		super();
	}
	//�����������췽��Ϊ���Ը���ʼֵ
	public Teacher(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	
}
