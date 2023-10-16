package Bronze4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		StringTokenizer str = new StringTokenizer(word," ");
		
		System.out.println(str.countTokens());
		
	}
}
