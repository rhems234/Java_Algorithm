package Bronze4;

import java.util.Scanner;

public class Baek_3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[11];
		boolean bl;
		int count = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			bl = false;
			for(int k = i+1; k < num.length; k++) {
				if(num[i] == num[k]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				count++;
			}
		}
		System.out.println(count);
	}
}
