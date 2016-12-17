package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *服务器端   发送数据 
 *
 */
public class TCPserver {
	//属性--->端口  服务器套接字
	public static final int port_server=10001;
	private  ServerSocket serverSocket=null; 
	
	//传送一个字符串
	public void start1(){
		String data="hello world!";
		try {
			//创建
			serverSocket=new ServerSocket(port_server);
			System.out.println("服务器开始工作");
			//数据操作
			Socket client=serverSocket.accept();
			System.out.println("服务器 接收  client");
			OutputStream os =client.getOutputStream();
			
			os.write(data.getBytes());
			System.out.println("服务器输出数据"+data);
			
			//关闭
			os.close();
			stop();
			System.out.println("服务器端关闭");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * 服务器端发送文件    先读取文件在输出到客户端
	 */
	public void start2(){
		String path ="h:/a.mp3";
		try {
			//输出
			serverSocket=new ServerSocket(port_server);//创建serverSocket
			System.out.println("服务器开始工作");
			Socket client =serverSocket.accept();//监听端口
			System.out.println("接收到客户端请求");
			OutputStream os = client.getOutputStream();
			//读取文件
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			byte[] buf=new byte[1024];
			int len =0;
			while((len=fis.read(buf))!=-1){
				os.write(buf,0,len);
			}
			System.out.println("服务器数据传送完成");
			//关闭	
			fis.close();
			stop();
			System.out.println("服务器关闭");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void start3(){
		
		try {
			//输出
			serverSocket=new ServerSocket(port_server);//创建serverSocket
			System.out.println("服务器开始工作");
			Socket client =serverSocket.accept();//监听端口
			System.out.println("接收到客户端请求");
			OutputStream os = client.getOutputStream();
			//读取文件
			String path ="h:/a.png";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			
			long total=file.length();
			
			byte[] buf=new byte[1024];
			int len =fis.read(buf);
			long per=0;
			float percent=0;
			
			while((len=fis.read(buf))!=-1){
				per+=len;
				os.write(buf,0,len);
				
				percent = (float)per/total;
				percent = percent * 100;
				System.out.println("进度："+(int)percent+"%");
//				Thread.sleep(500);
			}
			System.out.println("服务器数据传送完成");
			
			
			//关闭
			
			fis.close();
			stop();
			System.out.println("服务器关闭");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void start(){
		String path = "H:/a.mp3";

		try {
			// new
			serverSocket = new ServerSocket(port_server);
			System.out.println("server start");
			// 操作
			Socket client = serverSocket.accept();
			System.out.println("server accept client");
			
			OutputStream os = client.getOutputStream();
			
			//先从文件拿数据
			File file = new File(path); 
			FileInputStream fis = new FileInputStream(file);
		
			long total = file.length();
			System.out.println("total:" + total + "Byte");
			long per = 0;
			float percent = 0;
			
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {
				per += len;
				os.write(b, 0, len);
				
				percent = (float)per/total;
				
				percent = percent * 100;
				
				System.out.println("Server data:" + (int)percent + "%");
				
				Thread.sleep(1);
				
			}

			// 关闭
			fis.close();
			client.close();
			stop();
			System.out.println("server close");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public void stop(){
		if(serverSocket!=null&&!serverSocket.isClosed()){
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
