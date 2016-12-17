package com.test2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import javax.xml.soap.DetailEntry;

/*
 * 文件属性
 */
public class Demo1 {
	//创建文件
	public void test1(){
		//文件路径（字符串）
		String path="H:/hello.txt";
		//File类创建对象
		File file=new File(path);
		//创建文件
		try {
			file.createNewFile();
			System.out.println("创建文件成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//删除文件
	public void test2(){
		String path="H:/hello.txt";
		File file=new File(path);
		System.out.println(file.exists());
		
		file.delete();
		System.out.println("删除成功："+file.delete());
	}
	//创建多级文件夹  删除多级文件夹
	public void test3(){
		String path="H:/aa/bb/cc";
		File file=new File(path);
		boolean b=file.mkdirs();
		System.out.println("创建多级文件夹成功："+b);
		
		//删除只能一层一层的删
		file.delete();
	}
	//file类其他方法1
	public void test4(){
		String path="H:/a/b/c";
		File file=new File(path);
		file.mkdirs();
		//其他方法
		System.out.println("exists方法:  "+file.exists());
		System.out.println("获取绝对路径:  "+file.getAbsolutePath());
		System.out.println("name:  "+file.getName());
		System.out.println("路径：  "+file.getPath());
		System.out.println("是否是文件 "+file.isFile());
		System.out.println("是否是目录  "+file.isDirectory());
		System.out.println("是否影藏 "+file.isHidden());
		System.out.println("是否缓存  "+file.lastModified());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		String date=sdf.format(file.lastModified());
		System.out.println("lastModified  "+date);
		
		System.out.println("可读"+file.canRead());
		System.out.println("可写"+file.canWrite());
		System.out.println("长度"+file.length());

	}
	/*
	 * 其他方法2
	 */
	public void test5(){
		//路径
		String path = "H:/a1/a2/a3";
		//File类对象
		File file=new File(path);
		//创建多层文件夹
		file.mkdirs();
		
		//其他方法
		System.out.println("存在： "+file.isDirectory());
		System.out.println("上一级路径"+file.getParent());
		//下一级路径
		String [] pathArr=file.list(); 
		System.out.println(Arrays.toString(pathArr));
		for (String s : pathArr) {
			System.out.println(s);
		}
		//上一级文件
		System.out.println("上一级文件夹: "+file.getParentFile().getName());
		//下一级文件夹
		File[] file2=file.listFiles();
		for (File f : file2) {
			System.out.println("下一级文件夹: "+f.getName());
		}
		
	}
}









