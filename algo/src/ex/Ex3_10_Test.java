package ex;

public class Ex3_10_Test {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int count = 1;
		int n = 0;
		int m = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int i = 0; i < 7; i++) {
			n = (int)(Math.random()*3);
			m = (int)(Math.random()*3);
			
			if(arr[n][m] != 0) {
				arr[n][m] = 0;
				count++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
