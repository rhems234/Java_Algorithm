package Sliver5;

import java.util.Scanner;

public class Baek_1316 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			if(check()==true)
				sum++;
		}
		System.out.println(sum);
	}
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = scan.next();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				
				if(check[now-'a']==false) {
					check[now-'a']=true;
					prev = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}
		return true;
	}
}
