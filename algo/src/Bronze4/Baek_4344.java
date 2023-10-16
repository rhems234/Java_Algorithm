package Bronze4;

import java.util.Scanner;

public class Baek_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		int[] arr1 = new int[t];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
			int[] arr2 = new int[i];
			for(int j = 0; j < arr1.length; j++) {
				arr2[j] = scan.nextInt();
			}
		}
	}
}
