package Bronze3;

import java.util.Scanner;

public class Baek_1267 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int m = scan.nextInt();
			
			sum += ((m/30)+1)*10;
			result += ((m/60)+1)*15;
		}
		
		if(sum > result) {
			System.out.println("M "+result);
		} else if(result < sum) {
			System.out.println("Y "+sum);
		} else if(result == sum) {
			System.out.println("Y M "+sum);
		}
	}
}
