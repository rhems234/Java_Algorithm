package Bronze4;

import java.util.Scanner;

public class Baek_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] num = new int[t];
		
		for(int i = 0; i < t; i++) {
			num[i] = scan.nextInt();
		}
		
		int sum = 0;
		int score = 0;
		for(int i = 0; i < t; i++) {
			if(score < num[i]) {
				score = num[i];
			}
			sum += num[i];
		}
		System.out.println((double)(sum*100/score/t));
	}
}
