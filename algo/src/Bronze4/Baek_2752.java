package Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_2752 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[3];
		int n;
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			n = scan.nextInt();
			arr[i] = n;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
