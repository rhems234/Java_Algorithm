package Bronze2;

import java.util.Scanner;

public class Baek_2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int count = 1;
		int range = 2;
		
		if(n == 1) {
			System.out.print(1);
		}
		else {
			while(range <= n) {
				range = range + (6 + count);
				count++;
			}
			System.out.print(count);
		}
	}
}
