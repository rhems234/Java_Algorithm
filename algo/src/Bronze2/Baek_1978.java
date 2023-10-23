package Bronze2;

import java.util.Scanner;

public class Baek_1978 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = 0;
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			t = scan.nextInt();
			
			int divisor = 0; // 약수
			for(int j = 0; j < t; j++) {
				if(t%(j+1) == 0) {
					divisor++;
				}
			}
			if(divisor == 2) {
				count++;
			}
		}
		System.out.print(count);
	}
}
