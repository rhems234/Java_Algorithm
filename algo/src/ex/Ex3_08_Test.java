package ex;

import java.util.Scanner;

public class Ex3_08_Test {

	public static void main(String[] args) {
		System.out.print("정수 몇개? ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int random = (int)( Math.random()*n);
			
			if(i == 10 || i == 20) {
				System.out.println();
			}
			System.out.print(random+ " ");
		}
	}

}
