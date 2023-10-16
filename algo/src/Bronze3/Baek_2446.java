package Bronze3;

import java.util.Scanner;

public class Baek_2446 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (n*2-1)-(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < n-1; i++) {
			
			for(int j = 1; j < (n-1)-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <i*2+3; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
