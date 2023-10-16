package ex;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			int n = scan.nextInt();
			
			sum += n;
		}
		System.out.println(sum / 3);
	}
}
