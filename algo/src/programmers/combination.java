package programmers;

import java.util.Scanner;

public class combination {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int balls = scan.nextInt();
		int share = scan.nextInt();
		
		System.out.println(combination(balls, share));
		
	}
	
	public static int combination(int balls, int share) {
		if(balls == share || share == 0) {
			return 1;
		}
		return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
	}
}
