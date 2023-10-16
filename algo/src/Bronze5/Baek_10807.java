package Bronze5;

import java.util.Scanner;

public class Baek_10807 {

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] m = new int[n];
		
		for(int i = 0; i < n; i++) {
			m[i] = scan.nextInt();		
		}
		int v = scan.nextInt();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] == v) {
				count++;
			}
		}
		System.out.println(count);
	}
}
