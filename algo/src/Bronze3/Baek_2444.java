package Bronze3;

import java.util.Scanner;

public class Baek_2444 {

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
		
		for(int i = n-1; i >= 0 ; i--) {
			
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
