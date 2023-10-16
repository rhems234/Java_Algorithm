package java_test11;

import java.util.Scanner;

public class Ex4_11_Test {

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		char c = scan.next().charAt(0);
		
		int sum = 0;
		
		switch(c) {
		case '+' :
			Add ad = new Add();
			ad.setValue(n, m);
			sum = ad.Calculate();
			break;
		case '-':
			Sub sb = new Sub();
			sb.setValue(n, m);
			sum = sb.Calculate();
			break;
		case '*':
			Mul ml = new Mul();
			ml.setValue(n, m);
			sum = ml.Calculate();
			break;
		case '/':
			Div dv = new Div();
			dv.setValue(n, m);
			sum = dv.Calculate();
			break;
		}
		System.out.println(sum);
		scan.close();
		
	}
}
