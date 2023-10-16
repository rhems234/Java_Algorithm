package Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_2587 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[5];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			
		}
		
		Arrays.sort(arr);
		System.out.println(sum/5);
		System.out.println(arr[arr.length/2]);
	}
}
