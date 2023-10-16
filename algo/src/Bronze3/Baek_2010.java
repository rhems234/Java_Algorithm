package Bronze3;

import java.util.Scanner;

public class Baek_2010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int m = scan.nextInt();
			
			sum += m;
		}
		System.out.println(sum-(n-1));
	}
}
