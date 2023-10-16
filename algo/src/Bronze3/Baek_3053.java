package Bronze3;

import java.util.Scanner;

public class Baek_3053 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		double pi = Math.PI;
		
		System.out.printf("%.6f \n",n*n*pi);
		System.out.printf("%.6f",(double)(2*(n*n)));
	}
}
