package com.test2;

public interface MyFace2 extends MyFace1 {
	/*
	 * �ӿ��� ���ܹ��췽��   ����ֻ��public static final�����ǳ���
	 * 
	 * ����Ϊ���󷽷�  public abstract 
	 */
	
	//����
	public static final String name="�ӿ�2";
	//��û��дpublic static final����ôϵͳ��Ĭ������
	int age=20;
	
	//���ܹ��췽����  �ӿ��з���Ϊ���󷽷�
	public abstract void test1();
	//������û��дpublic abstract ��Ĭ������д
	void test2();
}
