package test;
/**
 * ѧ���ࣺ  ���ԣ�name gender math english chinese
 * 		    ������intro total avg
 */
public class Student {
	//����
	private String name;
	private String gender;
	private int math;
	private int english;
	private int chinese;
	//���췽��
	public Student(){
		
	}
	public Student(String name, String gender, int math, int english, int chinese) {
		super();
		this.name = name;
		this.gender = gender;
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	//����
	//���ҽ��ܷ���
	public String myName(){
		String myName=name;
		return myName;
	}
	public String intro(){
		String intro="�ҽ�"+name+",�Ա�"+gender+"  ��ѧ�ɼ���"
				+math+"  Ӣ��ɼ���"+english+"  ���ĳɼ���"+chinese;
		System.out.println(intro);
		return intro;
	}
	//�ַܷ���
	public int total(){
		int total=math+english+chinese;
		return total;
	}
	//ƽ���ַ���
	public int avg(){
		int avg=total()/3;
		return avg;
	}
}
