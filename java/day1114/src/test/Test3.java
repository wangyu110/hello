package test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("输入长度：");
        int len = in.nextInt();
 
        int number = 1;
        int h = 0;
        int l = len / 2;
        int[][] matrix = new int[len][len];
        
        //遍历 len*len
        for(int i = 0 ; i < len * len ; i ++){
        	//
            matrix[h][l] = number;
            if(number % len == 0){
                h ++;
            }else{
                l ++;
                h --;
            }
            //
            if(h < 0)h = len - 1;
            //
            if(l == len)l = 0;
            
            number ++;
        }
        
        //打印
        for(int i = 0 ; i < len ; i ++){
            for(int j = 0 ; j < len ; j ++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        in.close();
    }
}
