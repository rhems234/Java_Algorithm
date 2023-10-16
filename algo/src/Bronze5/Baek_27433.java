package Bronze5;

import java.util.Scanner;

public class Baek_27433 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		
		int sum = 1;
		
		for(int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}

}
