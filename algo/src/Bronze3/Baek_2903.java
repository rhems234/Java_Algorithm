package Bronze3;

import java.util.Scanner;

public class Baek_2903 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println((int)Math.pow(Math.pow(2, n)+1, 2));
	}
}
