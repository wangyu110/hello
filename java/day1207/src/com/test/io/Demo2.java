package com.test.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.PortableInterceptor.DISCARDING;

/**
 * �ֽڻ�����   �ַ�������
 */
public class Demo2 {
	//�ֽ���
	public void test1(){
		String src="H:/b1.txt";
		String dst="H:/b2.txt";
		long strat=System.currentTimeMillis();
		try {
			FileInputStream fis = new FileInputStream(new File(src));
			FileOutputStream fos =new FileOutputStream(new File(dst));
			int data=0;
			while((data=fis.read())!=-1){
				fos.write(data);//�˴�һ���ֽ�һ���ֽڶ�
				System.out.println("data:"+data);
			}
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end =System.currentTimeMillis();
		System.out.println("time1:"+(end-strat));
	}
	//�Զ��建����
	public void test2(){
		String src="H:/b1.txt";
		String dst="H:/b2.txt";
		long start=System.currentTimeMillis();
		try {
			FileInputStream fis = new FileInputStream(new File(src));
			FileOutputStream fos =new FileOutputStream(new File(dst));
			
			BufferedInputStream bis =new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//�Զ��建����
			byte[] b =new byte[20];
			
			fis.close();
			fos.close();
			//�Զ��建����
			byte [] b1= new byte[20]; 
			int n=0;
			while((n=fis.read(b))!=-1){//�˴�һ�ζ�20���ֽ�
				fos.write(b,0,n);
			}
			
			
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time2:"+(end=start));
	}
	//������
	public void test3(){
		String src="H:/b1.txt";
		String dst="H:/b2.txt";
		long strat=System.currentTimeMillis();
		try {
			FileInputStream fis = new FileInputStream(new File(src));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
