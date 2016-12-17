package test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for (int j = 0; j < arr.length; j++) {
			System.out.println(Arrays.toString(arr[j]));
		}
		System.out.println("---½»»»ºó--");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp=arr[j][i];
				arr[j][i]=arr[i][j];
				arr[i][j]=temp;
			}	
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println(Arrays.toString(arr[j]));
		}
	}

}
