package Bronze2;

import java.util.Scanner;

public class Baek_10870 {

	static int fi(int n) {
		
		if(n == 0) {
			return 0;
		}
		else if(n == 1 || n == 2) {
			return 1;
		}
		
		else {
			return fi(n-1)+fi(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(fi(n));
	}
	
}