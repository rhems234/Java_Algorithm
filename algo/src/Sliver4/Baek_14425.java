package Sliver4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baek_14425 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 집합의 크기
		int m = scan.nextInt(); // 검사할 문자열의 개수
		
		String temp;
		
		List<Integer> word = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			temp = scan.next();
			word.add(temp.hashCode());
		}
		
		int count = 0;
		
		for(int i = 0; i < m; i++) {
			temp = scan.next();
			if(word.contains(temp.hashCode())) {
				count++;
			}
		}
		System.out.print(count);
	}
}
