package Bronze3;

import java.util.Scanner;

public class Baek_5565 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			sum += scan.nextInt();
		}
		
		System.out.println(n - sum);
	}
}
