package Bronze4;

import java.util.Scanner;

public class Baek_1264 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			String str = scan.nextLine();
			int count = 0;
			if(str.equals("#"))
				break;
		
		
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			default:
				break;
				}
			}
		System.out.println(count);
		}
	}
}
