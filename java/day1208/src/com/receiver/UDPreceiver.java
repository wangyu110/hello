package com.receiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP���ն�
 */
public class UDPreceiver {
	private DatagramSocket socket=null;
	
	public void start(){
		
		try {
			//����socket����ȷ���������ݶ˿�
			socket=new DatagramSocket(9001);
			System.out.println("���ն�׼���������˿�9001");
			
			//��������
				//����һ��������
			byte [] buf=new byte[1024];
				//	����һ���հ�
			DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
			socket.receive(dPacket);
			//��������
			String data=new String(dPacket.getData(),0,dPacket.getLength());
			System.out.println("�������ݣ� "+data);
			//�ر�
			socket.close();
			System.out.println("���ݽ��ճɹ����ѹر�");
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
	//ѭ����������
	public void start2(){
		
		try {
			//����socket����
			socket =new DatagramSocket(9005);
			System.out.println("���ն�׼����ɣ��˿�9005");
			while(true){
				
				
				//��������
				byte[] buf=new byte[1024];
					//�����հ�
				DatagramPacket packet=new DatagramPacket(buf, buf.length);

				socket.receive(packet);
				//��������
				packet.getAddress();
				System.out.println(packet.getAddress());
				packet.getPort();
				System.out.println(packet.getPort());
				String data =new String(packet.getData(), 0,packet.getLength());
				System.out.println("�������ݳɹ���"+data);
				if(data.equals("over")){
					break;
				}
			}
			//�ر�
			socket.close();
			System.out.println("���ն˹ر�");
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
