package Bronze2;

import java.util.Scanner;

public class Baek_2581 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int sum = 0; // 합계
		int min = n + 1; // 최솟값
		
		for(int i = m; i < n+1; i++) { // m ~ n 까지 반복
			int count = 0;
			
			for(int j = 0; j < i; j++) { 
				if(i%(j+1)== 0) { 	// 소수의 갯수 확인
					count++;
				}
			}
			if(count == 2) {	// count = 2 일 경우 소수 판정
				sum += i;
				if(min > i) {
					min = i;
				}
			}
		}
		if(sum == 0) {	// 모든 숫자 검사 후 sum = 0 일 때 -1 출력
			System.out.println(-1);
			return;
		}
		
		System.out.println(sum);
		System.out.print(min);
	}
	
}
