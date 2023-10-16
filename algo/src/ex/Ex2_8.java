package ex;

import java.util.Scanner;

public class Ex2_8 {

	public static boolean inRect(int x, int y) {
		if((x>=100 && x<=200) && (y>=100 && y<=200)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 점 (x1,y1), (x2, y2)의 좌표를 입력하시오 >> ");
		boolean a, b;
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		a = inRect(x1,y1);
		b = inRect(x2,y2);
		
		if(a == true || b == true) {
			System.out.println("두 사각형은 겹칩니다.");
		} else {
			System.out.println("두 사각형은 겹치지 않습니다.");
		}
	}
}
