package Bronze4;

import java.util.Scanner;

public class Baek_10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] >= max) {
				max = num[i];
			} else if(num[i] <= min) {
				min = num[i];
			}
		}
		System.out.println(min +" "+ max);
	}
}