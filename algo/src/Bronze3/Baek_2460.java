package Bronze3;

import java.util.Scanner;

public class Baek_2460 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m;
		int now = 0;
		int max = 0;
		
		for(int i = 0; i < 10; i++) {
			n = scan.nextInt(); // 내린 사람
			m = scan.nextInt(); // 탄 사람
			
			now -= n;
			now += m;
			max = Math.max(max, now);
		}
		System.out.println(max);
	}
}
