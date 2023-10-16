package Bronze3;

import java.util.Scanner;

public class Baek_1547 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ball = 1;
		
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if(ball == x)
				ball = y;
			else if(ball == y)
				ball = x;
		}
		System.out.println(ball);
	}
}
