package ex;

import java.util.Scanner;

public class Ex3_06_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int won[] = new int[8];
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오 >> ");
		int n = scan.nextInt();

		for(int i = 0; i < 8; i++) {
			won[i] = n / unit[i];
			n = n % unit[i];
			System.out.println(unit[i]+"원 권"+won[i]+"개");
		}
		
		}

}
