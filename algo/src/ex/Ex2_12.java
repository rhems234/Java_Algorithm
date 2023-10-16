package ex;

import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		System.out.print("연산 >>");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		String opt = scan.next();
		int num2 = scan.nextInt();
		
		if(opt.equals("+")) {
			System.out.println(num1+num2);
		} else if (opt.equals("-")) {
			System.out.println(num1- num2);
		} else if (opt.equals("*")) {
			System.out.println(num1*num2);
		} else if (opt.equals("/")) {
			System.out.println(num1/num2);
		} else if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
