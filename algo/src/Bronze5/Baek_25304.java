package Bronze5;

import java.util.Scanner;

public class Baek_25304 {

	public static void main(String[] args) {
		int x, n, a, b;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		n = scan.nextInt();
		
		for(int i=1; i <= n; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			sum += a * b;
			
		}
		if(sum == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
