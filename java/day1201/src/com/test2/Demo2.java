package com.test2;

import java.io.File;
import java.io.IOException;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/*
 * file类实践
 */
public class Demo2 {
	/*
	 * 文件结构:
	 * 一级文件夹dir: d
	 * 二级文件夹dir:  d1        d2
	 * 三级文件夹dir: d11 d12   d21  d22
	 * 四级文件path :f1.txt  f2.txt  f3.txt  f4.txt  f5.txt  f6.txt  f7.txt  f8.txt
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
	 * 整体创建
	 */
	public void myFile1(){
		//先创建文件夹
		for (String s : dirs) {
			File file =new File(s);
			boolean b = file.mkdirs();
			System.out.println("成功？："+b);
		}
		//创建文件
		for (String s : paths) {
			File file = new File(s);
			try {
				boolean b =file.createNewFile();
				System.out.println("成功？: "+b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	//整体遍历
	public void myFile2(File f,String div){
		//参数检查
		if(!f.exists()){
			System.out.println(f+"不存在");
			return;
		}
		//打印名字
		System.out.println(div+f.getName());
		div+="--";
		//如果是文件夹，更近一部
		if(f.isDirectory()){
			File [] children = f.listFiles();
			for (File child : children) {
				//递归
				myFile2(child, div);
			}
		}
	}
	/*
	 * 整体删除
	 */
	public void myFile3(String path){
		File file = new File(path);
		if(!file.exists()){
			System.out.println("不存在");
			return;
		}
		
		//若果是文件夹就跟进一程
		if(file.isDirectory()){
			File[] children=file.listFiles();
			for (File f : children) {
				String p= f.getPath();
				myFile3(p);
			}
		}
		//如果是文件直接删除
		boolean b=file.delete();
		System.out.println(b);
		
		
	}
}





