package Bronze2;

import java.util.Scanner;

public class Baek_2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = (scan.nextInt()*scan.nextInt()*scan.nextInt());
		String str = Integer.toString(sum);
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j)-'0')==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
