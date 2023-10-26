package Sliver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baek_1269 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(bf.readLine());

		
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		
		Set<Integer> a = new HashSet<>();
	    Set<Integer> b = new HashSet<>();
		
		tk = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n; i++) {
			a.add(Integer.parseInt(tk.nextToken()));
		}
		
		tk = new StringTokenizer(bf.readLine());
		for(int i = 0; i < m; i++) {
			b.add(Integer.parseInt(tk.nextToken()));
		}
		
		Set<Integer> list = new HashSet<>(a);
		list.retainAll(b);
		
		int count = (a.size() - list.size()) + (b.size() - list.size());
		
		System.out.println(count);
	}
}
