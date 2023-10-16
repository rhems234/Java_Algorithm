package Bronze5;

import java.util.Scanner;

public class Baek_5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[31];
		
		for(int i = 1; i < 29; i++) {
			int std = scan.nextInt();
			num[std] = 1;
		}
		for(int i = 1; i < num.length; i++) {
			if(num[i] != 1) {
				System.out.println(i);
			}
		}
		scan.close();
		
	}
}