package com.test1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Scanner;
import org.xml.sax.InputSource;

public class Demo {
	public void test1(){
		// 数据
		String data="hello world";
		//路径
		String path="H:/test1.txt";
		//File
		File file=new File(path);
		//输出流
		try {
			FileWriter fw=new FileWriter(file);
			fw.write(data);
			
			System.out.println("输出完成");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void test2(){
		//数据接收
		String data="";
		//输入流
		try {
			FileReader fr=new FileReader(new File("H:/test1.txt"));
			char cbuf[]=new char[1024];
			int len=0;
			while((len=fr.read(cbuf))!=-1){
				fr.read(cbuf);
				data=new String(cbuf,0,len);
			}
			System.out.println(data);
			
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void test3(){
		String path="h:/test3.txt";
		try {
			FileReader fr=new FileReader(new File(path));
			//缓冲流
			BufferedReader  br=new BufferedReader(fr);
			String line1=br.readLine();
			String line2=br.readLine();
			String line3=br.readLine();
			String line4=br.readLine();
			System.out.println(line1);
			System.out.println(line2);
			System.out.println(line3);
			System.out.println(line4);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * buffer流
		 *    （1）流中知道缓冲区  提高读写效率
		 *    （2）缓冲流对象，提高一些特殊方法
		 */
	}
	public void test4(){
		//			PrintStream ps=new PrintStream(new File("h:/test4.txt"));
//					PrintStream ps=new PrintStream(System.out);
//					ps.println("hello");
//					System.out.print("打印完成");
//					
//					ps.close();
		
		
		InputStream is=System.in;
		byte[] b=new byte[256];
		try {
			int len =is.read(b);
			String data = new String(b,0,len);
			System.out.println(data);
			System.out.println("len:"+data.length());			
			
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void test5(){
		/*
		 * 标准流重新定向
		 * System.in  输入--->键盘
		 * System.out 输出--->显示器
		 */
		//输出
		String data="hello no data";
		File file = new File("h:/test5.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);

			System.setOut(ps);
			System.out.println(data);
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void test6(){
		try {
			FileInputStream fis = new FileInputStream(new File("h:/test3.txt"));
			System.setIn(fis);
			Scanner s =new Scanner(System.in);
			String line = s.nextLine();
			String line2 = s.nextLine();
			System.out.println(line2);
			
			fis.close();
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void test7(){
		try {
//			FileOutputStream fis = new FileOutputStream(new File("h:/test7.txt"));
//			DataOutputStream dot = new DataOutputStream(fis);
			//保存数据
//			dot.writeInt(100);
//			dot.writeByte(10);
//			dot.writeFloat(3.5f);
//			dot.writeBoolean(true);
//			dot.writeChars("hello");
//			dot.writeChars("hello");
//			dot.writeChars("hello");
//			dot.writeChars("hello");
//			
//			dot.close();
//			System.out.println("数据保存完成");
			DataInputStream dis = new DataInputStream(new FileInputStream(new File("H:/test7.txt")));
			int a1=dis.readInt();
			byte a2=dis.readByte();
			float a3=dis.readFloat();
			boolean a4=dis.readBoolean();
			System.out.println("a1:"+a1);
			System.out.println("a2:"+a2);
			System.out.println("a3:"+a3);
			System.out.println("a4:"+a4);
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//保存对象
	public void test8(){
		try {
			//输出   ----->对象流
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("h:/test8.txt")));
//			String s1 ="从明天起，做一个幸福的人";
//			oos.writeObject(s1);
			Student s2=new Student("zhang san",20);//对象类实现Serializiable
			oos.writeObject(s2);
			oos.close();
			//输入
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("h:/test8.txt")));
//			String s1=(String) ois.readObject();
//			System.out.println(s1);
			Student s3=(Student) ois.readObject();
			System.out.println(s3);
			ois.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





