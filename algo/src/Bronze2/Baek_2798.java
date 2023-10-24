package Bronze2;

import java.util.Scanner;

public class Baek_2798 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] card = new int[n];
		
		for(int i = 0; i < n; i++) {
			card[i] = scan.nextInt();
		}
		
		int sum = 0;
		int tmp = 0;
		for(int i = 0; i < card.length; i++) {
			for(int j = i+1; j < card.length; j++) {
				for(int k = j+1; k < card.length; k++) {
					sum = card[i] + card[j] + card[k];
					if(tmp < sum && sum <= m) {
						tmp = sum;
					}
				}
			}
		}
		System.out.println(tmp);
	}
}
