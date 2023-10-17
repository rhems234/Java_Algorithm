package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek_11005 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		List<Character> list = new ArrayList<>();
		while(n > 0) {
			if(n % b < 10) {
				list.add((char)(n % b + '0'));
			}
			else {
				list.add((char)(n % b - 10 + 'A'));
			}
			
			n /= b;
		}
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}
}
