package Bronze2;

import java.util.Scanner;

public class Baek_2745 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int n = scan.nextInt();
		int tmp = 1;
		int ans = 0;
		
		for(int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			
			if('A' <= c && c <= 'Z') {
				ans += (c-'A'+10) * tmp;
			} else {
				ans += (c - '0')*tmp;
			}
			tmp *= n;
		}
		System.out.println(ans);
	}
}
