package ex;

import java.util.Scanner;

public class Ex2_6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하시오>> ");
		int num = scan.nextInt();
		
		int count = 0;
		if(num/10 == 3 || num / 10 == 6 || num/10 == 9) {
			count++;
		} else if (num%10 == 3 || num % 10 == 6 || num % 10 == 9) {
			count++;
		}
		if(count == 0) {
			System.out.println(num);
		} else {
			System.out.print("박수 ");
		}
		if(count == 1) {
			System.out.println("짝짝");
		} else {
			System.out.println("짝");
		}
	}
}
