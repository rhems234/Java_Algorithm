package Sliver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1010 {
	
	// 메모이제이션을 위한 배열
	static int[][] dp;

	public static void main(String[] args) throws IOException{
		int n, m;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		
		dp = new int[31][31];
		
		for (int i = 0; i < t; i++) {
		    String[] input = reader.readLine().split(" ");
		    n = Integer.parseInt(input[0]);
		    m = Integer.parseInt(input[1]);
		    System.out.println(combination(m, n));
		}
		
	}
	
	// 경우의 수 조합(Combination)
	public static int combination(int n, int r) {
		if(n == r || r == 0) {
			return 1;
		} 
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
		return dp[n][r];
	}
}
