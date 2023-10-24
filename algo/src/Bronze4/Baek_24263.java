package Bronze4;

import java.util.Scanner;

public class Baek_24263 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		MenOfPassion(n);
		System.out.println(1);
	}
	
	public static void MenOfPassion(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum =  i;
		}
		System.out.println(sum);
		return;
	}
}
