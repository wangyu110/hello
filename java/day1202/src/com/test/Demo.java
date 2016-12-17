package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

/**
 *java IO��  
 *�ļ�
 *   ·��
 *   File
 *   IO
 *   FileInputStream
 *   file.read()
 *   FileOutputStream
 *   file.write()
 *   
 */
public class Demo {
	//����hello ���硱�����hello.txt��
	public void test1(){
		//����
		String data= "hello ����";
		//·��
		String path="H:/hello.txt";
		//file����
		File file = new File(path);
		//IO��(��� data)
		try {
			//������   --->FileOutputStream �����
			FileOutputStream fos = new FileOutputStream(file);
			//�������
			fos.write(data.getBytes());
			//�ر���
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����ɹ�");
	}
	//��������
	public void test2(){
		//��������
		String data="";
		//·��
		String path = "H:/hello.txt";
		//File����
		File file =new File(path);
		//IO�� ������-->FileInoutStream
		try {
			//������
			FileInputStream fis = new FileInputStream(file);
			//��ȡ����
			byte[] b=new byte[20];
			fis.read(b);//��ȡ�������ݴ洢���ֽ�����b��
			//�ر���
			fis.close();
			
			//���ֽ������е�����תΪ�ַ���
			data=new String(b);
			
			System.out.println("��������:"+data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//�������write����
	public void test3(){
		String data="hello world";
		try {
			//������
			FileOutputStream fos=new FileOutputStream(new File("H:/hello1.txt"));
			//�������
//			fos.write(97);//int�ͣ������ַ�����
			
			byte[] b=data.getBytes();
//			fos.write(b);//  byte[]�ֽ�����
			
			fos.write(b, 5, 4);//�ֽ�����  ָ��λ�����
			//�ر���
			fos.close();
			System.out.println("����ɹ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//��������������
	public void test4(){
		String data="";
		File file =new File("H:/hello1.txt");
		try {
			FileInputStream fis=new FileInputStream(file);
			//ֻ��һ��
//			int i=fis.read();
//			System.out.println("i:"+i);
//			for (int i = 0; i < 4; i++) {
//				fis.read();
//			}
//			System.out.println(fis.read());  //-1��ʾ���ݶ�ȡ���
			byte[] b=new byte[20];
			int len=0;
			while((len=fis.read(b))!=-1) {
//				String temp=new String(b, 0,len);
//				data+=temp;
				String temp=new String(b);
				System.out.println(temp);
			}
			//�ر���
			fis.close();
//			System.out.println("��������:"+data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//�����ļ�
	public void test5(String src,String dst){
		try {
			FileInputStream fis = new FileInputStream(new File(src));
			FileOutputStream fos =new FileOutputStream(new File(dst));
			
			byte []b=new byte[1024];
			int len=0;
			int count=0;
			while((len = fis.read(b)) != -1){
				count++;
				fos.write(b, 0, len);
//				fos.write(b);
				System.out.println(count);
				
			}
//			fis.read(b);
//			fos.write(b);
			
			//�ر�
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void tset6(String src,String dst){
		try {
			FileInputStream fis = new FileInputStream(new File(src));
			FileOutputStream fos =new FileOutputStream(new File(dst));

				byte []b=new byte[1024];
				int len=0;
				int count=0;
				while((len = fis.read(b)) != -1){
					count++;
					fos.write(b, 0, len);
					System.out.println(count);
					
				}

			
			//�ر�
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//������
	public void test7(){
		String [] data={"������ɽ����","�ƺ��뺣����","����ǧ��Ŀ��","����һ��¥��"};
		File file=new File("H:/shi.txt");
		String s1 = "\r\n";
		try {
			FileOutputStream fos =new FileOutputStream(file);
			for (String s : data) {
				fos.write(s.getBytes());
				fos.write(s1.getBytes());
			}
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void test8(){
		
	}
	
	
	
}








