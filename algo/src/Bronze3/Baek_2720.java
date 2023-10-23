package Bronze3;

import java.util.Scanner;

public class Baek_2720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		int[] change = {25, 10, 5, 1};
		
		for(int i = 0; i < t; i++) {
			int c = scan.nextInt();
			int[] result = new int[4];
			
			for(int j = 0; j < change.length; j++) {
				result[j] = c / change[j];
				c %= change[j];
			}
			for(int res : result) {
				System.out.print(res + " ");
			}
		}
	}
}
