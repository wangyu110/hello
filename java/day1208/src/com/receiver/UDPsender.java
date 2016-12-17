package com.receiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * UDP发送端
 */
public class UDPsender {
	//空的socket
	private DatagramSocket socket=null;
	
	public void send(String data){
		
		try {
			//创建socket对象
			socket =new DatagramSocket(9000);
			System.out.println("发送准备完成，端口9000");
			//处理数据
			byte[] buf= data.getBytes();//将data转换为字节数组形式
			//本机IP
			InetAddress address=InetAddress.getLocalHost();
			//数据装包
			DatagramPacket packet =new DatagramPacket(buf, 0, buf.length, address, 9000);
			
			//发送数据
			socket.send(packet);
			System.out.println("发送端发送数据： "+data);
			//关闭
			socket.close();
			System.out.println("发送数据成功！");
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
