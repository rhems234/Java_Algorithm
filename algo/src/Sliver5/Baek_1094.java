package Sliver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1094 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int stick = 0;
		int sum = 0;
		int x = Integer.parseInt(reader.readLine());
		
		for(int i = 64; i > 0; i/=2) {
			if(i > x) {
				continue;
			} else if(i == x) {
				stick = 1;
				break;
			}
			if(sum+i <= x) {
				sum += i;
				stick++;
			}
		}
		System.out.println(stick);
	}
}
