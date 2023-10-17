package programmers;

import java.util.Scanner;

public class rsp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String answer = "";
		String rsp = scan.nextLine();
		
		for(int i = 0; i < rsp.length(); i++) {
			if(rsp.split("")[i].equals("0")) {
				answer += "5";
			}
			else if(rsp.split("")[i].equals("2")) {
				answer += "0";
			}
			else {
				answer += "2";
			}
		}
		System.out.println(answer);
	}
}
