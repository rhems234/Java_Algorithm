package Bronze3;

import java.util.Scanner;

public class Baek_10886 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int count = 0;
		
		
		for(int i = 0; i < n; i++) {
			int m = scan.nextInt();
			arr[i] = m;
			
			if(arr[i] == 1) {
				count++;
			} else if(arr[i] == 0) {
				count--;
			}
		}
		if(count >= 1) {
			System.out.println("Junhee is cute!");
		} else if(count <= 0) {
			System.out.println("Junhee is not cute!");
		}
		
	}
}
