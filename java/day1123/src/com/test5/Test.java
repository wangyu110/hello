package com.test5;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Test {

	public static void main(String[] args) {
		int a1=20;
		//����integer����
		Integer a2=new Integer(a1);
		//integer����ת��double����
		double a3=a2.doubleValue();
		//integer����ת��Ϊfloat
		float a4=a2.floatValue();
		//integer����ת��Ϊint����
		int a5=a2.intValue();
		
		System.out.println(a2.toString());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		
	//װ�� 
		double e=1.23;
		//�ֶ�װ��
		Double e1=new Double(e);
		//�Զ�װ��
		Double e2=e;
		System.out.println("�ֶ�װ�䣺"+e1+"�Զ�װ�䣺"+e2);
	//����
		Double f=new Double(2.34);
		//�ֶ�����
		double f1=f.doubleValue();
		//�Զ�����
		double f2=f1;
		System.out.println("�ֶ�����"+f1+"�Զ����䣺"+f2);
		
		//Java �л������ͺ��ַ���֮���ת��
		/*
		 *  ʹ�ð�װ��� toString() 
		 *  ����ʹ��String��� valueOf() 
		 *  ������һ�����ַ������ϻ������ͣ��õ��ľ��ǻ����������ݶ�Ӧ���ַ���
		 */
		int g=10;
		String g1=Integer.toString(g);
		String g2=String.valueOf(g);
		String g3=g+"";
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		
		/*
		 * ���ַ���ת��Ϊ�������͵����ַ���
		 * 1�����ð�װ��� parseXxx ��̬����
		 * 2�����ð�װ��� valueOf() ����ת��Ϊ�������͵İ�װ�࣬���Զ�����
		 */
		
		String h="81";
		int h1=Integer.parseInt(h);
		int h2=Integer.valueOf(h);
		
	}
	
	
	

}
