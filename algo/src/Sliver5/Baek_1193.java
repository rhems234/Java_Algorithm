package Sliver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1193 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(reader.readLine());
		
		int cross_count = 1;
		int prev_count_sum = 0;
		
		while(true) {
			// 직전 대각선 누적합 + 해당 대각성 개수 이용한 범위 판별
			if(x <= prev_count_sum + cross_count) {
				
				if(cross_count % 2 == 1) {
					// 대각선의 개수가 홀수라면 분자가 큰 수부터 시작
					// 분자는 대각선상 블럭의 개수 - (x번째 - 직전 대각선까지의 블럭 개수 -1)
					// 분모는 x번째 - 직전 대각선까지의 블럭 개수
					System.out.println((cross_count - (x - prev_count_sum - 1)) + "/" + (x-prev_count_sum));
					break;
				}
				
				else {
					// 대각선의 개수가 짝수라면
					// 홀수 일 때의 출력을 반대로
					System.out.println((x-prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
					break;
				}
			}
			else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
		
	}
}
