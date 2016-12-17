package com.test2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import javax.xml.soap.DetailEntry;

/*
 * �ļ�����
 */
public class Demo1 {
	//�����ļ�
	public void test1(){
		//�ļ�·�����ַ�����
		String path="H:/hello.txt";
		//File�ഴ������
		File file=new File(path);
		//�����ļ�
		try {
			file.createNewFile();
			System.out.println("�����ļ��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//ɾ���ļ�
	public void test2(){
		String path="H:/hello.txt";
		File file=new File(path);
		System.out.println(file.exists());
		
		file.delete();
		System.out.println("ɾ���ɹ���"+file.delete());
	}
	//�����༶�ļ���  ɾ���༶�ļ���
	public void test3(){
		String path="H:/aa/bb/cc";
		File file=new File(path);
		boolean b=file.mkdirs();
		System.out.println("�����༶�ļ��гɹ���"+b);
		
		//ɾ��ֻ��һ��һ���ɾ
		file.delete();
	}
	//file����������1
	public void test4(){
		String path="H:/a/b/c";
		File file=new File(path);
		file.mkdirs();
		//��������
		System.out.println("exists����:  "+file.exists());
		System.out.println("��ȡ����·��:  "+file.getAbsolutePath());
		System.out.println("name:  "+file.getName());
		System.out.println("·����  "+file.getPath());
		System.out.println("�Ƿ����ļ� "+file.isFile());
		System.out.println("�Ƿ���Ŀ¼  "+file.isDirectory());
		System.out.println("�Ƿ�Ӱ�� "+file.isHidden());
		System.out.println("�Ƿ񻺴�  "+file.lastModified());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		String date=sdf.format(file.lastModified());
		System.out.println("lastModified  "+date);
		
		System.out.println("�ɶ�"+file.canRead());
		System.out.println("��д"+file.canWrite());
		System.out.println("����"+file.length());

	}
	/*
	 * ��������2
	 */
	public void test5(){
		//·��
		String path = "H:/a1/a2/a3";
		//File�����
		File file=new File(path);
		//��������ļ���
		file.mkdirs();
		
		//��������
		System.out.println("���ڣ� "+file.isDirectory());
		System.out.println("��һ��·��"+file.getParent());
		//��һ��·��
		String [] pathArr=file.list(); 
		System.out.println(Arrays.toString(pathArr));
		for (String s : pathArr) {
			System.out.println(s);
		}
		//��һ���ļ�
		System.out.println("��һ���ļ���: "+file.getParentFile().getName());
		//��һ���ļ���
		File[] file2=file.listFiles();
		for (File f : file2) {
			System.out.println("��һ���ļ���: "+f.getName());
		}
		
	}
}









