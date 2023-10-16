package Bronze3;

import java.util.Scanner;

public class Baek_10813 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n+1];
		
		for(int i=1; i <= n; i++) {
			arr[i]=i;
		}
		
		for(int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int temp=arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
