package ex;

import java.util.Scanner;

public class Ex3_04_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char c = s.charAt(0);
		// 97~122
		
		for(int i = 0; i <= 5; i++) {
			
			for(int j = 5; j-1 >= i; j--) {
				System.out.print((char)(c-j)+" ");
			}
			System.out.println();
		}

	}

}
