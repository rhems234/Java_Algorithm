package Bronze4;

import java.util.Scanner;

public class Baek_1110 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int t = n;
		int count = 0;
		
		while(true) {
			int left = t / 10;
			int right = t % 10;
			t = right * 10 + (left + right) % 10;
			count++;
			if(n == t) {
				break;
			}
		}
		System.out.println(count);
		
	}
}
