package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

/**
 *java IO流  
 *文件
 *   路径
 *   File
 *   IO
 *   FileInputStream
 *   file.read()
 *   FileOutputStream
 *   file.write()
 *   
 */
public class Demo {
	//将“hello 世界”输出到hello.txt中
	public void test1(){
		//数据
		String data= "hello 世界";
		//路径
		String path="H:/hello.txt";
		//file对象
		File file = new File(path);
		//IO流(输出 data)
		try {
			//定义流   --->FileOutputStream 输出流
			FileOutputStream fos = new FileOutputStream(file);
			//输出数据
			fos.write(data.getBytes());
			//关闭流
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("输出成功");
	}
	//输入数据
	public void test2(){
		//接收数据
		String data="";
		//路径
		String path = "H:/hello.txt";
		//File对象
		File file =new File(path);
		//IO流 输入流-->FileInoutStream
		try {
			//定义流
			FileInputStream fis = new FileInputStream(file);
			//读取数据
			byte[] b=new byte[20];
			fis.read(b);//读取到的数据存储进字节数组b中
			//关闭流
			fis.close();
			
			//将字节数组中的内容转为字符串
			data=new String(b);
			
			System.out.println("读到数据:"+data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//输出流的write方法
	public void test3(){
		String data="hello world";
		try {
			//定义流
			FileOutputStream fos=new FileOutputStream(new File("H:/hello1.txt"));
			//输出数据
//			fos.write(97);//int型，代表字符编码
			
			byte[] b=data.getBytes();
//			fos.write(b);//  byte[]字节数据
			
			fos.write(b, 5, 4);//字节数据  指定位置输出
			//关闭流
			fos.close();
			System.out.println("输出成功");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//输入流常见东西
	public void test4(){
		String data="";
		File file =new File("H:/hello1.txt");
		try {
			FileInputStream fis=new FileInputStream(file);
			//只读一个
//			int i=fis.read();
//			System.out.println("i:"+i);
//			for (int i = 0; i < 4; i++) {
//				fis.read();
//			}
//			System.out.println(fis.read());  //-1表示数据读取完成
			byte[] b=new byte[20];
			int len=0;
			while((len=fis.read(b))!=-1) {
//				String temp=new String(b, 0,len);
//				data+=temp;
				String temp=new String(b);
				System.out.println(temp);
			}
			//关闭流
			fis.close();
//			System.out.println("输入数据:"+data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//复制文件
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
			
			//关闭
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

			
			//关闭
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//多次输出
	public void test7(){
		String [] data={"白日依山尽，","黄河入海流。","欲穷千里目，","更上一层楼。"};
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








