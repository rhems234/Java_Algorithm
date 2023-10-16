package Bronze2;

import java.util.Scanner;

public class Baek_2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		
		int[] arr = new int[n];
		
		for(i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(i = 0; i < n; i++) {
			int min = i;
			for(int j = i+1; j < n; j++ ) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			System.out.println(arr[i]);
		}
	}
}
