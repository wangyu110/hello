package com.demo1;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Demo1 {
	/*
	 * �Զ����쳣
	 */
	public void test1() throws MyException{
		int a=10;
		int b=0;
		int c=0;
		
		if(c==0){
			throw new MyException("����Ϊ0");
		}
		c=a/b;
		System.out.println(c);
	}
	/*
	 * ��װ��
	 */
	public void test2(){
//		//��������
//		int a=10;
//		//�������� ��װ��
//		Integer b=20;
//		Integer c1=new Integer(a);
//		Integer c2=new Integer(b);
//		
//		int c=c1+c2;
//		System.out.println(c);
		
		//װ��  ����
			//װ
//		int e=10;
//		Integer e1=new Integer(e);
//		Integer e2=e;
//		System.out.println(e1+e2);
//			//��
//		Integer f=new Integer(20);
//		int f1=f.intValue();		//�ֶ�����
//		int f2=f;		//�Զ�����
//		System.out.println(f1+f2);
//		
//		//�ֽ����� byte
//		byte g=10;
//		Byte g1=new Byte((byte)10);// װ��ʱ��Ҫǿ��ת��Ϊbyte��   ��ȻĬ��Ϊint
//		
//		short h=20;
//		Short h1=new Short((short)20);
//		
//		int i=30;
//		Integer i1=new Integer(30);
//		
//		long j=40L;
//		Long j1=new Long(40L);
//		
//		float k=3.0f;
//		Float k1=new Float(3.0f);
//		
//		double l=4.0;
//		Double l1=new Double(4.0);
		
//		//�о��������ͷ���
//		int a=20;
//		Integer a1=new Integer(a);
//		System.out.println("ת��Ϊ�ַ���:"+a1.toString());
//		System.out.println("�Ƚ�asc���ֵ:"+a1.compareTo(21));
//		System.out.println("ת��Ϊ������:"+Integer.toBinaryString(15));
//		System.out.println("ת��Ϊ16����:"+Integer.toHexString(15));
//		System.out.println("��ϣ��:"+a1.hashCode());
//		Integer b1=Integer.valueOf(10);//int����ת��ΪInteger
//		
//		
		
		//String ����
		StringBuilder s=new StringBuilder("abcde");
		System.out.println("��ϣ��"+s.hashCode());
		System.out.println("��ӣ�"+s.append("f"));
		System.out.println("ɾ��Ԫ�أ�"+s.delete(0, 3));
		System.out.println("���ã�"+s.reverse());

		
		
		
	}
}













