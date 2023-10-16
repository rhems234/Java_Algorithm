package Bronze4;

import java.util.Scanner;

public class Baek_10101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int total = 180;
		
		if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		} else if(a+b+c == total && a == b || b == c || a == c) {
			System.out.println("Isosceles");
		} else if(a+b+c == total) {
			System.out.println("Scalene");
		} else  {
			System.out.println("Error");
		}
		
	}
}
