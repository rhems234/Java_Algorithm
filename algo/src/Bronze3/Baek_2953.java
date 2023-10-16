package Bronze3;

import java.util.Scanner;

public class Baek_2953 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int count = 0;
		
		for(int i = 1; i <= 5; i++) {
			int sum = 0;
			for(int j = 0; j < 4; j++) {
				int score = scan.nextInt();
				sum += score;
				if(max<=sum) {
					max = sum;
					count = i;
				}
			}
		}
		System.out.println(count+" "+max);
		scan.close();
	}
}
