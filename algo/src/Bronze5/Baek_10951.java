package Bronze5;

import java.util.Scanner;

public class Baek_10951 {
	
	public static void main(String[] args) {
		int a, b;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			 a = scan.nextInt();
			 b = scan.nextInt();
			 sum = a + b;
			 
			 System.out.println(sum);
		}
	}
}
