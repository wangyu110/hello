package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPclient {
	public static final int port_server=10001;
	private Socket clientSocket=null;
	//获取服务器发送的数据
	public void connect1(){
		
		try {
			//创建
			InetAddress address = InetAddress.getLocalHost();
			clientSocket=new Socket(address, port_server);
			System.out.println("客户端创建成功");
			//数据操作
			InputStream is = clientSocket.getInputStream();
			
			byte[] buf = new byte[1024];
			int len=is.read(buf);
			System.out.println("客户端接收数据");
			String data=new String(buf,0,len);
			System.out.println("客户端接收到数据data："+data);
			//关闭
			is.close();
			stop();
			System.out.println("客户端关闭");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	//将服务器端发送的数据存储
	public void connect2(){
		String path="H:/a4.mp3";
		
		try {
			InetAddress address = InetAddress.getLocalHost();
			clientSocket=new Socket(address, port_server);
			InputStream is = clientSocket.getInputStream();
			FileOutputStream fos = new FileOutputStream(new File(path));
			
			byte[] b =new byte[1024];
			int len=0;
			while((len=is.read(b))!=-1){
				fos.write(b, 0 ,len);
			}
			//关闭
			fos.close();
			stop();
			System.out.println("客户端关闭");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void stop(){
		if (clientSocket!=null&&!clientSocket.isClosed()) {
			try {
				clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void connect3() {
		
		String path = "f:/bbb.png";

		try {

			InetAddress address = InetAddress.getLocalHost();
			clientSocket = new Socket(address,port_server);
			System.out.println("client create");

			InputStream is = clientSocket.getInputStream();
			FileOutputStream fos = new FileOutputStream(new File(path));

			byte[] b = new byte[1024];
			int len = 0;
			while((len = is.read(b)) != -1){
				fos.write(b, 0, len);
			}

			fos.close();
			stop();
			System.out.println("client disconnection");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void connect(){
		String path = "H:/img1.mp3";

		try {

			InetAddress address = InetAddress.getLocalHost();
			clientSocket = new Socket(address, port_server);
			System.out.println("client create");

			InputStream is = clientSocket.getInputStream();
			FileOutputStream fos = new FileOutputStream(new File(path));

			byte[] b = new byte[1024];
			int len = 0;
			while((len = is.read(b)) != -1){
				fos.write(b, 0, len);
			}

			fos.close();
			stop();
			System.out.println("client disconnection");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
