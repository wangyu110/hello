package test;

import java.util.Arrays;

public class Demo {
	int a;
	int b;
	int c;
	public Demo(){
//		System.out.println(a+" "+b+" "+c);
	}
	public Demo(int a){
		System.out.println(a+" "+b+" "+c);
	}
	public Demo(int a,int b,int c){
		System.out.println(a+" "+b+" "+c);
	}
	public void demo1(){
		int [][]arr={{1,2,3},{4,5,6},{7,8,9,}};
//		int max=arr[0][0];
//		int min=arr[0][0];
//		for(int i=0;i<arr.length;i++){
//			for(int j=0;j<arr[i].length;j++){
//				if(arr[i][j]>max){
//					max=arr[i][j];
//				}
//				if(arr[i][j]<min){
//					min=arr[i][j];
//				}
//			}
//		}
//		System.out.println("最大值为："+max+" 最小值为： "+min);
		
		
//		int[][] arr1=new int[3][3];
//		for(int i=0;i<arr.length;i++){
//			for(int j=0;j<arr[i].length;j++){
//				arr1[j][i]=arr[i][j];
//			}
//		}
//		for(int i=0;i<arr1.length;i++){
//			System.out.println(Arrays.toString(arr1[i]));
//		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(Arrays.toString(arr[i]));
	}
}
