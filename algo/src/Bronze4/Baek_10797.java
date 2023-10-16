package Bronze4;

import java.util.Scanner;

public class Baek_10797 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m;
		int arr[] = new int[5];
		
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			 m = scan.nextInt();
			 arr[i] = m;
			 
			 if(n == arr[i] ) {
				 count++;
			 }
		}
		System.out.println(count);
	}

}
