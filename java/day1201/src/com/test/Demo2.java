package com.test;

import java.io.File;
import java.io.IOException;

/*
 * java IO
 * ·��  �ļ�λ��(�ַ�����
 * File��  �ļ�λ�� �����ļ�  �����ļ���  ɾ���ļ����ļ���
 * IO��(�ļ���д)
 */
public class Demo2 {
	
	public void test1(){
		//�ļ�·�������ַ���
		String path1="H:/hello";
		String path2="H:/world.txt";
		//����File�����
		File file1=new File(path1);
		File file2=new File(path2);
//		�о�File�෽��
//		System.out.println("exist�������Ƿ���ڣ���"+file1.exists());
//		System.out.println("exist�������Ƿ���ڣ���"+file2.exists());
//		//�����ļ�(createNewFile)  �ļ���(mkdir  mkdirs)
//		file1.mkdir();
//		boolean b1=file1.mkdir();
//		try {
//			file2.createNewFile();
//			boolean b2=file2.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//ɾ��(delete)
//		file1.delete();
//		file2.delete();
//		System.out.println("del�Ƿ�ɹ�:"+file1.delete());
		
		//��������ļ���
		String path3="H:/aa/bb/cc";
		File file3=new File(path3);
		System.out.println(file3.exists());
		file3.mkdirs();	
	}
	public void test2(){
		//�����ļ���ͬʱ�����ļ�
		String path="H:/aa/bb/cc/hello.txt";
		File file=new File(path);
		System.out.println(file.exists());
		//���жϸ�Ŀ¼�Ƿ���ڣ�getParentFile() --��ȡ��Ŀ¼��
		System.out.println(file.getParentFile());
		if (!file.getParentFile().exists()) {
			boolean b=file.getParentFile().mkdirs();
			System.out.println("��Ŀ¼�������: "+b);
		}
		//��Ŀ¼���ں󴴽��ļ�
		try {
			boolean b2=file.createNewFile();
			System.out.println("�ļ�������ɣ�  "+b2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}













