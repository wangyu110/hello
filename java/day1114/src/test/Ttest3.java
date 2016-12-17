package test;

public class Ttest3 {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				for (int k = 1; k <=9; k++) {
					if(i+j+k==15&&(i!=j&&i!=k)&&(j!=i&&j!=k)&&(k!=i&&k!=j)&&(j==5)){
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}

}
