package ex;

import java.util.Scanner;

public class Ex2_11 {

	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12) >> ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if (month == 6 || month == 7 || month == 8){
			System.out.println("여름");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨율");
		}
	}
}
