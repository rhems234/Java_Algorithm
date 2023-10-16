package Bronze4;

import java.util.Scanner;

public class Baek_10156 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int sum = (a*b)-c;
		
		if(sum < 0) {
			System.out.println(0);
		} else {
			System.out.println(sum);
		}
	}

}
