package Bronze3;

import java.util.Scanner;

public class Baek_3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x[] = new int[3];
		int y[] = new int[3];
		
		int x1, y1;
		
		for(int i = 0; i < 3; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		if(x[0] == x[1]) {
			x1 = x[2];
		} else if(x[1] == x[2]) {
			x1 = x[0];
		} else {
			x1 = x[1];
		}
		
		if(y[0] == y[1]) {
			y1 = y[2];
		} else if(y[1] == y[2]) {
			y1 = y[0];
		} else {
			y1 = y[1];
		}
		
		System.out.print(x1 + " " + y1);
	}

}
