package ex;

import java.util.Scanner;

public class Ex3_05_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		int n;
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			 n = scan.nextInt();

			 if(n % 3 == 0) {
				 arr[i] = n;
			 }
			 System.out.print(arr[i]+ " ");
		}
		

	}

}
// 1 5 99 22 345 154 2346 55 32 85