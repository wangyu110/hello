package test;

public class Student {
	private String name;//����
	private double score;//�ɼ�
	//��ȡ����
	public String getName() {
	return name;
	}
	//��������
	public void setName(String name) {
	this.name = name;
	}
	//��ȡ�ɼ�
	public double getScore() {
	return score;
	}
	//���óɼ�
	public void setScore(double score) {
	this.score = score;
	}
	//�޲������췽��
	public Student() {
	super();
	}
	public Student(String name, double score) {
	super();
	this.name = name;
	this.score = score;
	}
}
