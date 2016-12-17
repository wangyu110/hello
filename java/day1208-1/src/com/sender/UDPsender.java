package com.sender;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * UDP发送端
 */
public class UDPsender {
	//空的socket
	private DatagramSocket socket=null;
	
	public void send(String data){
		
		try {
			//创建socket对象
			socket =new DatagramSocket(9002);
			System.out.println("发送准备完成，端口:9002");
			//处理数据
			byte[] buf= data.getBytes();//将data转换为字节数组形式
			//本机IP
//			InetAddress address=InetAddress.getLocalHost();
			//发送到其他电脑  先得知对方电脑局域网IP
			InetAddress address2=InetAddress.getByName("192.168.2.112");
			//数据装包
			DatagramPacket packet =new DatagramPacket(buf, 0, buf.length, address2, 9001);
			
			//发送数据
			socket.send(packet);
			System.out.println("发送端发送数据： "+data);
			//关闭
			socket.close();
			System.out.println("发送数据成功！");
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//循环输入数据
	public void send2(){
		try {
			//创建socket对象
			socket=new DatagramSocket(9003);
			System.out.println("发送端准备完成，端口9003");
			//键盘输入数据
			Scanner scanner =new Scanner(System.in);
			while(true){
				String line = scanner.nextLine();
				//处理数据
				byte[] buf =line.getBytes();
//				InetAddress address=InetAddress.getLocalHost();
				InetAddress address2=InetAddress.getByName("192.168.2.107");
				//数据包
				DatagramPacket packet = new DatagramPacket(buf,0, buf.length,address2,9320);
				//发送数据
				socket.send(packet);
				System.out.println("发送数据："+line);
				if(line.equals("over")){
					break;
				}
				
				
			}
			//关闭
			socket.close();
			scanner.close();
			System.out.println("发送端关闭");
			
			
			
			
			
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
