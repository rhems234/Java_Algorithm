package Bronze2;

import java.util.Scanner;

public class Baek_10988 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int mid = (str.length()/2);
		
		int result = 1;
		
		for(int i = 0; i < mid; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				result = 0;
			}
		}
		System.out.println(result);
	}
}
