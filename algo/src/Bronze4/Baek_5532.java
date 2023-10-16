package Bronze4;

import java.util.Scanner;

public class Baek_5532 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		double max = Math.max((double)a/ (double)c, (double)b / (double)d);
		
		max = Math.ceil(max);
		l -= (int)max;
		
		System.out.println(l);
		
	}
}
