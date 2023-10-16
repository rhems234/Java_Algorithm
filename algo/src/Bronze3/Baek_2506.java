package Bronze3;

import java.util.Scanner;

public class Baek_2506 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] answer = new int[n];
		
		for(int i= 0; i < n; i++) {
			answer[i] = i;
			System.out.println(answer);
		}
	}
}
