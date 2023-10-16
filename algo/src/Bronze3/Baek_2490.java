package Bronze3;

import java.util.Scanner;

public class Baek_2490 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i <= 3; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			sum = a+b+c+d;
			
			if(sum == 3) {
				System.out.println("A");
			} else if(sum == 2) {
				System.out.println("B");
			} else if(sum == 1) {
				System.out.println("C");
			} else if(sum == 4) {
				System.out.println("E");
			} else if(sum == 0) {
				System.out.println("D");
			}
		}
		
	}
}
