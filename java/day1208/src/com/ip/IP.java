package com.ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class IP {

	public static void main(String[] args) {
		
//		try {
//			//创建InetAddress实例
//			InetAddress address=InetAddress.getLocalHost();
//			System.out.println("本机："+address);
//			System.out.println("本机IP："+address.getHostAddress());
//			System.out.println("本机机名："+address.getHostName());
//			//通过获取计算机名打印本机信息
//			InetAddress address2=InetAddress.getByName("COZHE1DXLRTVC95");
//			System.out.println("本机信息："+address2);
//			System.out.println("本机IP："+address2.getHostAddress());
//			System.out.println("本机机名："+address2.getHostName());
//			
//			//获取网站IP、
//			InetAddress address3=InetAddress.getByName("www.baidu.com");
//			System.out.println(address3);
//			System.out.println("名字："+address3.getHostName());
//			System.out.println("IP:"+address3.getHostAddress());
//			
//			
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
		test1();
		test2();
		

	}
	/*
	 * DatagramPacket  数据报
	 * 封装个数据    数据是字节格式
	 */
	public static void test1(){
		//packet数据包
		String s = "hello";
		byte[] b =s.getBytes();
		InetAddress myAddress;
		
		try {

			myAddress=InetAddress.getLocalHost();
			//构造数据包
			DatagramPacket packet = new DatagramPacket(b, 0,b.length, myAddress, 8000);
			//包中装东西
			packet.setData(b);
			packet.setLength(b.length);
			packet.setPort(8001);
			packet.setAddress(myAddress);
			//包中拿东西
			packet.getLength();
			packet.getAddress();
			packet.getPort();
			packet.getData();
			System.out.println(packet.getLength());
			System.out.println(new String(packet.getData()));
			System.out.println(packet.getPort());
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	/*
	 * DatagramSocket  
	 * 负责通信
	 */
	public static void test2(){
		try {
			DatagramSocket ds =new DatagramSocket(8001);
//			DatagramPacket packet = new DatagramPacket(b, 0,b.length, myAddress, 8000);
//			ds.send(packet);  //发送数据
//			ds.receive(p);    //接收数据
			ds.close();
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	

}
