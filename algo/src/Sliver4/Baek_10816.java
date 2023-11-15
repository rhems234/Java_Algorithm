package Sliver4;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_10816 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int m = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < m; i++) {
			int key = scan.nextInt();
			
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}
	
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		while (lo < hi) {
 
			int mid = (lo + hi) / 2;
 
			if (key <= arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			} 
		}
		return lo;
	}
	
	private static int upperBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		while (lo < hi) {
 
			int mid = (lo + hi) / 2;
 
			if (key < arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}
