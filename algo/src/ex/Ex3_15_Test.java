package ex;

import java.util.Scanner;

public class Ex3_15_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		try {
			System.out.print(n + " x" + m + "=" + n*m);
		} catch(Exception e) {
			System.out.println("실수는 입력하면 안됩니다.");
		}
		scan.close();
	}
}
