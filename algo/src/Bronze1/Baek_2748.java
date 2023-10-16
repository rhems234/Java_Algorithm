package Bronze1;

import java.util.Scanner;

public class Baek_2748 {

	static long[] arr;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arr = new long[n+1];
		
		for(int i = 0; i < n+1; i++) {
			arr[i] = -1;
		}
		
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(Fibo(n));
	}
	
	public static long Fibo(int n) {
		if(arr[n] == -1) {
			arr[n] = Fibo(n-1)+Fibo(n-2);
		}
		return arr[n];
	}
}
