package Bronze4;

import java.util.Scanner;

public class Baek_5554 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int sum = a+b+c+d;
		
		int x = sum/60;
		int y = sum%60;
		
		System.out.println(x);
		System.out.println(y);
	}
}
