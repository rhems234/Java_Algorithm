package Sliver5;

import java.util.Scanner;

public class Baek_2563 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[][] array = new int[100][100];
		int count = 0;
		
		for(int i = 0; i < t; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			for(int j = x; j < x+10; j++) {
				for(int k = y; k < y+10; k++) {
					array[j][k] = 1;
				}
			}
		}
			
			for(int n = 0; n < 100; n++) {
				for(int j = 0; j < 100; j++) {
					if(array[n][j] == 1) {
						count++;
					}
				}
			}
			System.out.println(count);
	}
}
