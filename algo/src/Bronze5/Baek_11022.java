package Bronze5;

import java.util.Scanner;

public class Baek_11022 {

	public static void main(String[] args) {
		int t;
		int a, b;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt();
		
		for(int i=1; i <=t; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			sum = a+b;
			System.out.println("Case #"+i+": "+a+" + "+b+" = " +sum);
		}
	}
}
