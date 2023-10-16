package ex;

import java.util.Scanner;

public class Ex2_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원의 중심과 반지름 입력 >> ");
		int cen1 = scan.nextInt();
		int cen2 = scan.nextInt();
		double radius = scan.nextDouble();
		System.out.println("점 입력 >> ");
		int dot1 = scan.nextInt();
		int dot2 = scan.nextInt();
		
		double circle = Math.sqrt(((dot1-cen1)*(dot1-cen1))+(dot2-cen2)*(dot2-cen2));
		
		if(circle < radius) {
			System.out.println("점 ("+dot1+","+dot2+")는 원 안에 있다");
		} else {
			System.out.println("점 ("+dot1+","+dot2+")는 원 안에 없다");
		}
	}
}
