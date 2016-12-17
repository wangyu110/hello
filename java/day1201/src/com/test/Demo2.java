package com.test;

import java.io.File;
import java.io.IOException;

/*
 * java IO
 * 路径  文件位置(字符串）
 * File类  文件位置 创建文件  创建文件夹  删除文件、文件夹
 * IO流(文件读写)
 */
public class Demo2 {
	
	public void test1(){
		//文件路径就是字符串
		String path1="H:/hello";
		String path2="H:/world.txt";
		//创建File类对象
		File file1=new File(path1);
		File file2=new File(path2);
//		研究File类方法
//		System.out.println("exist方法（是否存在）："+file1.exists());
//		System.out.println("exist方法（是否存在）："+file2.exists());
//		//创建文件(createNewFile)  文件夹(mkdir  mkdirs)
//		file1.mkdir();
//		boolean b1=file1.mkdir();
//		try {
//			file2.createNewFile();
//			boolean b2=file2.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//删除(delete)
//		file1.delete();
//		file2.delete();
//		System.out.println("del是否成功:"+file1.delete());
		
		//创建多层文件夹
		String path3="H:/aa/bb/cc";
		File file3=new File(path3);
		System.out.println(file3.exists());
		file3.mkdirs();	
	}
	public void test2(){
		//创建文件夹同时创建文件
		String path="H:/aa/bb/cc/hello.txt";
		File file=new File(path);
		System.out.println(file.exists());
		//先判断父目录是否存在（getParentFile() --获取父目录）
		System.out.println(file.getParentFile());
		if (!file.getParentFile().exists()) {
			boolean b=file.getParentFile().mkdirs();
			System.out.println("父目录创建完成: "+b);
		}
		//父目录存在后创建文件
		try {
			boolean b2=file.createNewFile();
			System.out.println("文件创建完成：  "+b2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}













