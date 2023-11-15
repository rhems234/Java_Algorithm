package Sliver5;

import java.util.Scanner;

public class Baek_13241 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		int result = gcd(a, b);
		
		sb.append(a * b / result);
		
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
