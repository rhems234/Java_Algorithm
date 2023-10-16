package Bronze5;

import java.util.Scanner;

public class Baek_25314 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n/4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
