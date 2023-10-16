package Bronze4;

import java.util.Scanner;

public class Baek_5717 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m, f;
		
		while(true) {
			m = scan.nextInt();
			f = scan.nextInt();
			
			if(m == 0 || f == 0)
				break;
			
			
			System.out.println(m+f);
		}
		
	}
}
