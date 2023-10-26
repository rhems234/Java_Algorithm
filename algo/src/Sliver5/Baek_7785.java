package Sliver5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Baek_7785 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i < n; i++) {
			String name = scan.next();
			String state = scan.next();
			
			if(map.containsKey(name)) {
				map.remove(name);
			} else {
				map.put(name, state);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		
		for(String li : list) {
			System.out.println(li + " ");
		}
	}
}
