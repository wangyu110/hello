package com.ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class IP {

	public static void main(String[] args) {
		
//		try {
//			//����InetAddressʵ��
//			InetAddress address=InetAddress.getLocalHost();
//			System.out.println("������"+address);
//			System.out.println("����IP��"+address.getHostAddress());
//			System.out.println("����������"+address.getHostName());
//			//ͨ����ȡ���������ӡ������Ϣ
//			InetAddress address2=InetAddress.getByName("COZHE1DXLRTVC95");
//			System.out.println("������Ϣ��"+address2);
//			System.out.println("����IP��"+address2.getHostAddress());
//			System.out.println("����������"+address2.getHostName());
//			
//			//��ȡ��վIP��
//			InetAddress address3=InetAddress.getByName("www.baidu.com");
//			System.out.println(address3);
//			System.out.println("���֣�"+address3.getHostName());
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
	 * DatagramPacket  ���ݱ�
	 * ��װ������    �������ֽڸ�ʽ
	 */
	public static void test1(){
		//packet���ݰ�
		String s = "hello";
		byte[] b =s.getBytes();
		InetAddress myAddress;
		
		try {

			myAddress=InetAddress.getLocalHost();
			//�������ݰ�
			DatagramPacket packet = new DatagramPacket(b, 0,b.length, myAddress, 8000);
			//����װ����
			packet.setData(b);
			packet.setLength(b.length);
			packet.setPort(8001);
			packet.setAddress(myAddress);
			//�����ö���
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
	 * ����ͨ��
	 */
	public static void test2(){
		try {
			DatagramSocket ds =new DatagramSocket(8001);
//			DatagramPacket packet = new DatagramPacket(b, 0,b.length, myAddress, 8000);
//			ds.send(packet);  //��������
//			ds.receive(p);    //��������
			ds.close();
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	

}
