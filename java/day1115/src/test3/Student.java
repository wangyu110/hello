package test3;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Student {
	//��װ����
	private String stuno;
	private String name;
	private float math;
	private float english;
	private float computer;
	//getter  setter  
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	//���췽��
	public Student(){
		
	}
	public Student(String stuno,String name,float math,float english,float computer){
		this.stuno=stuno;
		this.name=name;
		this.math=math;
		this.english=english;
		this.computer=computer;
	}
	//����
 
	//����ɼ��ܺ�
	public float sum(){
		float sum=math+english+computer;
		return sum;
	}
	//����ƽ���ɼ�
	public float avg(){
		float avg=(math+english+computer)/3;
		return avg;
	}
	//�����߳ɼ�
	public float max(){
		float max=math;
		if(english>max){
			max=english;
		}
		if(computer>max){
			max=computer;
		}
		return max;
	}
	//�����ͳɼ�
	public float min(){
		float min=math;
		if(english<min){
			min=english;
		}
		if(computer<min){
			min=computer;
		}
		return min;
	}
	
}











