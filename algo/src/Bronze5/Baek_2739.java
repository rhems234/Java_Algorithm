package Bronze5;

import java.util.Scanner;

public class Baek_2739 {

	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(n +" * "+ i + " = "+ (n*i));
		}

	}

}
