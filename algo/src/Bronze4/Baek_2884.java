package Bronze4;

import java.util.Scanner;

public class Baek_2884 {

	public static void main(String[] args) {
		int h, m;
		
		Scanner scan = new Scanner(System.in);
		h = scan.nextInt();
		m = scan.nextInt();
		
		if(m < 45 ) {
			h--;
			m =  60 - (45 -m);
			if(h < 0 ) {
				h = 23;
			}
			System.out.println(h + " " +m);
		}
		else {
			System.out.println(h +" "+(m-45));
		}

	}

}
