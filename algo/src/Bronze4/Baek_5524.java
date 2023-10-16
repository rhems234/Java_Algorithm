package Bronze4;

import java.util.Scanner;

public class Baek_5524 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			String name = scan.next();
			
			name = name.toLowerCase();
			
			System.out.println(name);
		}
	}
}