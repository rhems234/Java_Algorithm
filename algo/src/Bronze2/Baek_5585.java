package Bronze2;

import java.util.Scanner;

public class Baek_5585 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum = 1000-n;
		int num = 0;
		
		while(sum > 0) {
			if(sum/500 > 0) {
				num += sum/500;
				sum = sum%500;
			}
			else if(sum/100 > 0) {
				num += sum/100;
				sum = sum%100;
			}
			else if(sum/50 > 0) {
				num += sum/50;
				sum = sum%50;
			}
			else if(sum/10 > 0) {
				num += sum/10;
				sum = sum%10;
			}
			else if(sum/5 > 0) {
				num += sum/5;
				sum = sum%5;
			}
			else {
				num += sum/1;
			}
		}
		System.out.println(num);
		
	}
}
