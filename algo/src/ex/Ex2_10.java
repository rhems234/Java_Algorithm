package ex;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 원의 중심과 반지름 입력 >> ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		double rad = scan.nextDouble();
		System.out.print("두 번째 원의 중심과 반지름 입력 >> ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		double rad2 = scan.nextDouble();
		
		double circle = Math.sqrt(((x1-x2)*(x1-x2) + ((y1-y2)*(y1-y2))));
		
		if(circle <= rad+rad2) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
	}
}
