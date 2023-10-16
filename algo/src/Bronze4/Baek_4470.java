package Bronze4;

import java.util.Scanner;

public class Baek_4470 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.next());
		
		for(int i = 0; i < t; i++) {
			System.out.println((i+1)+". "+scan.nextLine());
		}
	}
}
