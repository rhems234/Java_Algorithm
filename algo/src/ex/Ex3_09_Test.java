package ex;

public class Ex3_09_Test {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
