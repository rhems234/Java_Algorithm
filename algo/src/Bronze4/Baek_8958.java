package Bronze4;

import java.util.Scanner;

public class Baek_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		String str;
		for(int i = 0; i < t; i++) {
			str = scan.next();
			
			int count = 0;
			int result = 0;
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					count++;
					result += count;
				} 
				else {
					count = 0;
				}
			}
			System.out.println(result);
		}
	}
}
