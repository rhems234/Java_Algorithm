package Bronze3;

import java.util.Scanner;

public class Baek_2501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				b--;
			}
			if(b == 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
