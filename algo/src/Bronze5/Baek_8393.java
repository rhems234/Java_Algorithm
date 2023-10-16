package Bronze5;

import java.util.Scanner;

public class Baek_8393 {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i=1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
