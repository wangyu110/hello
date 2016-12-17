package com.sender;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * UDP���Ͷ�
 */
public class UDPsender {
	//�յ�socket
	private DatagramSocket socket=null;
	
	public void send(String data){
		
		try {
			//����socket����
			socket =new DatagramSocket(9002);
			System.out.println("����׼����ɣ��˿�:9002");
			//��������
			byte[] buf= data.getBytes();//��dataת��Ϊ�ֽ�������ʽ
			//����IP
//			InetAddress address=InetAddress.getLocalHost();
			//���͵���������  �ȵ�֪�Է����Ծ�����IP
			InetAddress address2=InetAddress.getByName("192.168.2.112");
			//����װ��
			DatagramPacket packet =new DatagramPacket(buf, 0, buf.length, address2, 9001);
			
			//��������
			socket.send(packet);
			System.out.println("���Ͷ˷������ݣ� "+data);
			//�ر�
			socket.close();
			System.out.println("�������ݳɹ���");
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//ѭ����������
	public void send2(){
		try {
			//����socket����
			socket=new DatagramSocket(9003);
			System.out.println("���Ͷ�׼����ɣ��˿�9003");
			//������������
			Scanner scanner =new Scanner(System.in);
			while(true){
				String line = scanner.nextLine();
				//��������
				byte[] buf =line.getBytes();
//				InetAddress address=InetAddress.getLocalHost();
				InetAddress address2=InetAddress.getByName("192.168.2.107");
				//���ݰ�
				DatagramPacket packet = new DatagramPacket(buf,0, buf.length,address2,9320);
				//��������
				socket.send(packet);
				System.out.println("�������ݣ�"+line);
				if(line.equals("over")){
					break;
				}
				
				
			}
			//�ر�
			socket.close();
			scanner.close();
			System.out.println("���Ͷ˹ر�");
			
			
			
			
			
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
