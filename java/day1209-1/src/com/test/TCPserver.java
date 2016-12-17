package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *��������   �������� 
 *
 */
public class TCPserver {
	//����--->�˿�  �������׽���
	public static final int port_server=10001;
	private  ServerSocket serverSocket=null; 
	
	//����һ���ַ���
	public void start1(){
		String data="hello world!";
		try {
			//����
			serverSocket=new ServerSocket(port_server);
			System.out.println("��������ʼ����");
			//���ݲ���
			Socket client=serverSocket.accept();
			System.out.println("������ ����  client");
			OutputStream os =client.getOutputStream();
			
			os.write(data.getBytes());
			System.out.println("�������������"+data);
			
			//�ر�
			os.close();
			stop();
			System.out.println("�������˹ر�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * �������˷����ļ�    �ȶ�ȡ�ļ���������ͻ���
	 */
	public void start2(){
		String path ="h:/a.mp3";
		try {
			//���
			serverSocket=new ServerSocket(port_server);//����serverSocket
			System.out.println("��������ʼ����");
			Socket client =serverSocket.accept();//�����˿�
			System.out.println("���յ��ͻ�������");
			OutputStream os = client.getOutputStream();
			//��ȡ�ļ�
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			byte[] buf=new byte[1024];
			int len =0;
			while((len=fis.read(buf))!=-1){
				os.write(buf,0,len);
			}
			System.out.println("���������ݴ������");
			//�ر�	
			fis.close();
			stop();
			System.out.println("�������ر�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void start3(){
		
		try {
			//���
			serverSocket=new ServerSocket(port_server);//����serverSocket
			System.out.println("��������ʼ����");
			Socket client =serverSocket.accept();//�����˿�
			System.out.println("���յ��ͻ�������");
			OutputStream os = client.getOutputStream();
			//��ȡ�ļ�
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
				System.out.println("���ȣ�"+(int)percent+"%");
//				Thread.sleep(500);
			}
			System.out.println("���������ݴ������");
			
			
			//�ر�
			
			fis.close();
			stop();
			System.out.println("�������ر�");
			
			
			
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
			// ����
			Socket client = serverSocket.accept();
			System.out.println("server accept client");
			
			OutputStream os = client.getOutputStream();
			
			//�ȴ��ļ�������
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

			// �ر�
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
