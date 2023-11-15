package Bronze1;

import java.util.Scanner;

public class Baek_1934 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int c = gcd(a, b);
			
			sb.append(a * b / c).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int gcd(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
	
	public static int lcm(int a, int b) {
	    return a * b / gcd(a, b);
	}
}
