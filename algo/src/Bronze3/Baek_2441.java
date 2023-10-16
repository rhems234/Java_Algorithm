package Bronze3;

import java.util.Scanner;

public class Baek_2441 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = n-i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = i; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
