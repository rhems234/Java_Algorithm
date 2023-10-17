package Bronze5;

import java.util.Scanner;

public class Baek_2738_scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					arr[j][k] += scan.nextInt();
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
