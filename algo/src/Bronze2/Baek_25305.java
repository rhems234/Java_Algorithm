package Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_25305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i = 0;
		int[] arr = new int[n];
		
		for(i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[n-m]);
	}
}
