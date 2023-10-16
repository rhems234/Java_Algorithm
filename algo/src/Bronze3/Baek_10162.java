package Bronze3;

import java.util.Scanner;

public class Baek_10162 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 5min, 1min, 10sec
		int t = scan.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(t >= 300) {
			a = t/300;
			t -= 300*a;
		}
		if(t >= 60) {
			b = t/60;
			t -= 60*b;
		}
		if(t%10!=0) {
			System.out.println(-1);
		}
		else {
			c = t/10;
			
			System.out.println(a + " "+b+" "+c);
		}
			
	}
}
