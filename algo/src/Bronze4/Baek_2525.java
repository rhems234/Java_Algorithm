package Bronze4;

import java.util.Scanner;

public class Baek_2525 {

	public static void main(String[] args) {
		int a, b;
		int c;
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		a += c / 60;
		b += c % 60;
		
		if(b >= 60) {
			a += 1;
			b -= 60;
		}
		if(a >= 24) {
			a -= 24;
		}
		System.out.println(a +" "+b);
	}

}
