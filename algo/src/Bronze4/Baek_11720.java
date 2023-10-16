package Bronze4;

import java.util.Scanner;

public class Baek_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String str = scan.next();
		
		String[] num = new String[str.length()];
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			num[i] = str.substring(i, i+1);
			sum += Integer.parseInt(num[i]);
		}
		System.out.println(sum);
	}
}
