package Bronze4;

import java.util.Scanner;

public class Baek_5596 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		int c1 = scan.nextInt();
		int d1 = scan.nextInt();
		
		int sum = a+b+c+d;
		int sum1 = a1+b1+c1+d1;
		
		int max = 0;
		
		if(sum > sum1) {
			max = sum;
		} else if(sum < sum1) {
			max = sum1;
		} else if(sum == sum1) {
			max = sum;
		}
		System.out.println(max);
	}
}
