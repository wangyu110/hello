package arrayDemo;

public class Array1 {
	public static void main(String[] args) {
		int[] arr={1,43,22,45,21};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
		int[][] arr1={{2,4},{4,5},{6,3},{8,3}};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		int[] arr2=new int[4];
		for(int i=0;i<arr2.length;i++){
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
		int[][] arr3=new int[4][4];
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				arr3[i][j]=i+j;
				System.out.print(arr3[i][j]+"   ");
			}
			System.out.println();
		}
		
		
	}
}
