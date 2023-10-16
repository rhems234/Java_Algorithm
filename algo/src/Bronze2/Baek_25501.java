package Bronze2;

import java.util.Scanner;

public class Baek_25501 {

	static int result;
	
	static int recursion(String s, int i, int r) {
		result++;
		if(i >= r)
			return 1;
		else if(s.charAt(i) != s.charAt(r))
			return 0;
		else 
			return recursion(s, i+1, r-1);
	}
	
	static int Palindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			result = 0;
			String str = scan.next();
			System.out.println(Palindrome(str) + " " + result);
		}

	}

}