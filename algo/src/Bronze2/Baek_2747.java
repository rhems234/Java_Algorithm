package Bronze2;

import java.util.Scanner;

public class Baek_2747 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int F1 = 0, F2=1,F3=1;
		
		for(int i = 2; i <= n; i++) {
			F3=F1+F2;
			F1=F2;
			F2=F3;
		}
		System.out.println(F3);
	}
}
