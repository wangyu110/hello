package com.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

/*
 * �ַ���
 */
public class Demo1 {
	/*
	 * reader  ��  writer  ���о�
	 */
	public void myIO(){
		Reader reader=null;
//		reader.read();
//		reader.read(cbuf);
//		reader.read(cbuf, off, len);
//		reader.close();
		
		Writer writer=null;
//		writer.write(c);
//		writer.write(str);
//		writer.write(cbuf);
//		writer.write(cbuf, off, len);
//		writer.close();
	}
	//���һ���ַ���
	public void myIO1(){
		//����
		char c='��';
		//·��
		String path = "H:/a1.txt";
		//file
		File file =new File(path);
		//�����
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(c);
			//�ر���
			fw.close();
			System.out.println("������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�������ַ�
	public void myIO2(){
		//�ַ�����
		char[] cs={'��','��','ѧ','ϰ'};
		//File
		File file = new File("H:/a2.txt");
		
		//�����
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(cs);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//���һ���ַ���
	public void myIO3(){
		//�ַ���
		String string="�Ұ�ѧϰ";
		File file = new File("H:/a3.txt");
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(string);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//����һ���ַ�
	public void test1(){
		//������
		char c='0';
		//file
		File file =new File("H:/a1.txt");
		try {
			FileReader fr =new FileReader(file);
			int c1= fr.read();
			c=(char)c1;
			System.out.println("int-c1:"+c1);
			System.out.println("char-c"+c);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//�������ַ�
	public void test2(){
		//������
		char [] cs=new char[20];
		//File
		File file = new File("H:/a2.txt");
		//������
		try {
			FileReader fr = new FileReader(file);
			int c=fr.read(cs);
			System.out.println("int-c:"+c+Arrays.toString(cs));
			String s=new String(cs, 0, c);
			System.out.println("read:"+s);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}












