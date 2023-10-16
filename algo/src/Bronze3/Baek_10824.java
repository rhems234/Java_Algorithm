package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10824 {
	
	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 StringBuilder sb = new StringBuilder();
		 
	     String[] strs = bf.readLine().split(" ");
	     
	     int ab = Integer.parseInt(strs[0]+strs[1]);
	     int cd = Integer.parseInt(strs[2]+strs[3]);
	     
	     int sum = ab+cd;
	     
	     System.out.println(sum);
		
	}
}
