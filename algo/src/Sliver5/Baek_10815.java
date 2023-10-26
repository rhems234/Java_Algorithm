package Sliver5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baek_10815 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		Map<Integer,Integer> card = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			int number = scan.nextInt();
			card.put(number, card.getOrDefault(number, 0) + 1);
		}
		
		int m = scan.nextInt();
		
		String[] result = new String[m];
		for(int i = 0; i < m; i++) {
			int num = scan.nextInt();
			result[i] = hasCard(card, num);
		}
		
		System.out.println(String.join(" ", result));
	}
	
	public static String hasCard(Map<Integer, Integer> card, int num) {
		if(card.containsKey(num) && card.get(num) != 0) {
			return "1";
		}
		return "0";
	}
}
