package Bronze4;

import java.util.Scanner;

public class Baek_10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			
			if(n%h == 0) {
				System.out.println((h*100)+ (n/h));
			} else {
				System.out.println(((n%h)*100)+((n/h)+1));
			}
		}
	}
}
