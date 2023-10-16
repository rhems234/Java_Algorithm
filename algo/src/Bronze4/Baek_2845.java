package Bronze4;

import java.util.Scanner;

public class Baek_2845 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		
		int arr[] = new int[5];
		int sum = n*p;
		
		for(int i = 0; i < arr.length; i++) {
			int s = scan.nextInt();
			arr[i] -= sum-s;
			
			System.out.print(arr[i]+" ");
		}
		
	}
}
