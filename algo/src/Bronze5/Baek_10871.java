package Bronze5;

import java.util.Scanner;

public class Baek_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(x > num[i]) {
				System.out.print(num[i] +" ");
			}
		}
	}
}
