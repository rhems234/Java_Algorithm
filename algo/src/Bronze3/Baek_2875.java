package Bronze3;

import java.util.Scanner;

public class Baek_2875 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		
		int count = 0;
		
		while(n>=2 && m>=1 && m+n>=3+k) {
			n = n-2;
			m = m-1;
			count++;
		}
		System.out.println(count);
	}
}
