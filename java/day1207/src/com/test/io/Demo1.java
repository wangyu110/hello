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
 * 字符流
 */
public class Demo1 {
	/*
	 * reader  与  writer  的研究
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
	//输出一个字符流
	public void myIO1(){
		//数据
		char c='我';
		//路径
		String path = "H:/a1.txt";
		//file
		File file =new File(path);
		//输出流
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(c);
			//关闭流
			fw.close();
			System.out.println("输出完成");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//输出多个字符
	public void myIO2(){
		//字符数组
		char[] cs={'我','爱','学','习'};
		//File
		File file = new File("H:/a2.txt");
		
		//输出流
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(cs);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//输出一个字符串
	public void myIO3(){
		//字符串
		String string="我爱学习";
		File file = new File("H:/a3.txt");
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(string);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//输入一个字符
	public void test1(){
		//缓冲区
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
	//输入多个字符
	public void test2(){
		//缓冲区
		char [] cs=new char[20];
		//File
		File file = new File("H:/a2.txt");
		//输入流
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












