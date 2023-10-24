package Bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_14215 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int[] s = {a, b, c};
		
		Arrays.sort(s);
		
		if(s[0] + s[1] > s[2]) {
			System.out.println(a+b+c);
		} else {
			System.out.println((s[0]+s[1]) * 2 - 1);
		}
	}
}
