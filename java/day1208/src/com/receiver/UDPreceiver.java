package com.receiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP接收端
 */
public class UDPreceiver {
	private DatagramSocket socket=null;
	
	public void start(){
		
		try {
			//创建socket对象，确定接收数据端口
			socket=new DatagramSocket(9001);
			System.out.println("接收端准备就绪，端口9001");
			
			//接收数据
				//定义一个空数组
			byte [] buf=new byte[1024];
				//	定义一个空包
			DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
			socket.receive(dPacket);
			//处理数据
			String data=new String(dPacket.getData(),0,dPacket.getLength());
			System.out.println("接收数据： "+data);
			//关闭
			socket.close();
			System.out.println("数据接收成功，已关闭");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void stop(){
		if(socket != null && !socket.isClosed()){
			socket.close();
		}
	}
	//循环接收数据
	public void start2(){
		
		try {
			//创建socket对象
			socket =new DatagramSocket(9005);
			System.out.println("接收端准备完成，端口9005");
			while(true){
				
				
				//接收数据
				byte[] buf=new byte[1024];
					//创建空包
				DatagramPacket packet=new DatagramPacket(buf, buf.length);

				socket.receive(packet);
				//处理数据
				packet.getAddress();
				System.out.println(packet.getAddress());
				packet.getPort();
				System.out.println(packet.getPort());
				String data =new String(packet.getData(), 0,packet.getLength());
				System.out.println("接收数据成功："+data);
				if(data.equals("over")){
					break;
				}
			}
			//关闭
			socket.close();
			System.out.println("接收端关闭");
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
