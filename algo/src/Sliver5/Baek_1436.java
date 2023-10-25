package Sliver5;

import java.util.Scanner;

public class Baek_1436 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int number = 0;
		int count = 0;
		
		while(true) {
			number++;
			int tmp = number;
			boolean found = false;
			
			while(true) {
				if(tmp == 0) {
					break;
				}
				if(tmp % 1000 == 666) {
					count++;
					if(count == n) {
						found = true;
					}
					break;
				}
				tmp /= 10;
			}
			if(found) {
				System.out.println(number);
				break;
			}
		}
	}
}
