package com.test2;

import java.io.File;
import java.io.IOException;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/*
 * file��ʵ��
 */
public class Demo2 {
	/*
	 * �ļ��ṹ:
	 * һ���ļ���dir: d
	 * �����ļ���dir:  d1        d2
	 * �����ļ���dir: d11 d12   d21  d22
	 * �ļ��ļ�path :f1.txt  f2.txt  f3.txt  f4.txt  f5.txt  f6.txt  f7.txt  f8.txt
	 */
	public static final String ROOT  ="H:/d";
	public static final String D1    =ROOT + File.separator + "/d1";
	public static final String D2    =ROOT + File.separator + "/d2";
	
	public static final String D11   =D1   + File.separator + "/d11";
	public static final String D12   =D1   + File.separator + "/d12";
	public static final String D21   =D2   + File.separator + "/d21";
	public static final String D22   =D2   + File.separator + "/d22";
	
	public static final String PATH1 =D11  + File.separator + "f1.txt";
	public static final String PATH2 =D11  + File.separator + "f2.txt";
	public static final String PATH3 =D12  + File.separator + "f3.txt";
	public static final String PATH4 =D12  + File.separator + "f4.txt";
	public static final String PATH5 =D21  + File.separator + "f5.txt";
	public static final String PATH6 =D21  + File.separator + "f6.txt";
	public static final String PATH7 =D22  + File.separator + "f7.txt";
	public static final String PATH8 =D22  + File.separator + "f8.txt";
	
	private String [] dirs={D11,D12,D21,D22};
	private String [] paths={PATH1,PATH2,PATH3,PATH4,PATH5,PATH6,PATH7,PATH8};
	
	/*
	 * ���崴��
	 */
	public void myFile1(){
		//�ȴ����ļ���
		for (String s : dirs) {
			File file =new File(s);
			boolean b = file.mkdirs();
			System.out.println("�ɹ�����"+b);
		}
		//�����ļ�
		for (String s : paths) {
			File file = new File(s);
			try {
				boolean b =file.createNewFile();
				System.out.println("�ɹ���: "+b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	//�������
	public void myFile2(File f,String div){
		//�������
		if(!f.exists()){
			System.out.println(f+"������");
			return;
		}
		//��ӡ����
		System.out.println(div+f.getName());
		div+="--";
		//������ļ��У�����һ��
		if(f.isDirectory()){
			File [] children = f.listFiles();
			for (File child : children) {
				//�ݹ�
				myFile2(child, div);
			}
		}
	}
	/*
	 * ����ɾ��
	 */
	public void myFile3(String path){
		File file = new File(path);
		if(!file.exists()){
			System.out.println("������");
			return;
		}
		
		//�������ļ��о͸���һ��
		if(file.isDirectory()){
			File[] children=file.listFiles();
			for (File f : children) {
				String p= f.getPath();
				myFile3(p);
			}
		}
		//������ļ�ֱ��ɾ��
		boolean b=file.delete();
		System.out.println(b);
		
		
	}
}





