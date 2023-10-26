package Sliver2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Baek_18870 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] origin = new int[n]; // 원본 배열
		int[] sorted = new int[n]; // 정렬 할 배열
		
		// rank를 매길 HashMap
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			// 원본 배열, 정렬 할 배열에 값을 넣어준다.
			sorted[i] = origin[i] = scan.nextInt();
		}
		
		// wjdfuf
		Arrays.sort(sorted);
		
		int rank = 0;
		
		// 정렬 된 배열을 순회하면서 map에 넣어준다.
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				/*
				 *  이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
				 *  중복되면 안되므로, 원소가 중복되지 않을 때만
				 *  map에 원소와 그에 대응되는 순위를 넣어준다.
				 */
				rankingMap.put(v, rank);
				rank++;	// map에 넣고나면 다음 순위를 가릴수 있도록 1을 더해준다.
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}
}
