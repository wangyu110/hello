package com.receiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * UDP���Ͷ�
 */
public class UDPsender {
	//�յ�socket
	private DatagramSocket socket=null;
	
	public void send(String data){
		
		try {
			//����socket����
			socket =new DatagramSocket(9000);
			System.out.println("����׼����ɣ��˿�9000");
			//��������
			byte[] buf= data.getBytes();//��dataת��Ϊ�ֽ�������ʽ
			//����IP
			InetAddress address=InetAddress.getLocalHost();
			//����װ��
			DatagramPacket packet =new DatagramPacket(buf, 0, buf.length, address, 9000);
			
			//��������
			socket.send(packet);
			System.out.println("���Ͷ˷������ݣ� "+data);
			//�ر�
			socket.close();
			System.out.println("�������ݳɹ���");
			
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
