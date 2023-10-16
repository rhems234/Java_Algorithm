package Bronze4;

import java.util.Scanner;

public class Baek_2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[9];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
				count = i+1;
			}
			
		}
		System.out.println(max);
		System.err.println(count);
	}
}
