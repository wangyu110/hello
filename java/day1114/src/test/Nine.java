package test;

import java.util.Arrays;
import java.util.Scanner;

public class Nine {
	public int demo1(int []arr,int x){
		int value=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x){
				value=i;
				break;
			}
		}
		return value;
		
	}
	/**
	 * ��дһ������ʵ�ֽ��������е�Ԫ��λ�á�
	 * ��һ�������һ��������
	 * �ڶ����͵����ڶ���������
	 */
	public void demo2(){
		int []arr={1,2,3,4,5,6,7,8};
		int l=arr.length;
		for (int i = 0; i <l/2 ; i++) {
			
			int temp=arr[l -1-i];
			arr[l-i-1]=arr[i];
			arr[i]=temp;
			
			arr[l-1-i]=arr[i]+arr[l-1-i]-(arr[i]=arr[l-1-i]);
			
			arr[i]=arr[i]^arr[l-1-i];
			arr[l-1-i]=arr[i]^arr[l-1-i];
			arr[i]=arr[i]^arr[l-1-i];

		}
		System.out.println(Arrays.toString(arr));
	}
}







