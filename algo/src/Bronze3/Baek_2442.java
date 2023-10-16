package Bronze3;

import java.util.Scanner;

public class Baek_2442 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
