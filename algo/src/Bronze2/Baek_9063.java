package Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_9063 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();			
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println((x[n-1] - x[0]) * (y[n-1]- y[0]));
	}
}
