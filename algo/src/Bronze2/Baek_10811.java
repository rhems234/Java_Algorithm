package Bronze2;

import java.io.IOException;
import java.util.Scanner;

public class Baek_10811 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[scan.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt()-1;
			int b = scan.nextInt()-1;
			
			while(a < b) {
				int temp = arr[a];
				arr[a++] = arr[b];
				arr[b--] = temp;
			}
		}
		String ret = "";
		for(int j = 0; j < arr.length; j++) {
			ret += arr[j] + " ";
		}
		System.out.print(ret.trim());
		scan.close();
	}
}
