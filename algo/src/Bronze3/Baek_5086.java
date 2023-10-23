package Bronze3;

import java.util.Scanner;

public class Baek_5086 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(b % a == 0) {
				System.out.println("factor");
			}else if(a % b == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
}
