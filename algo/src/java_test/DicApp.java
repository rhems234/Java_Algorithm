package java_test;

import java.util.Scanner;

public class DicApp {
	Scanner scan = new Scanner(System.in);
	String word;
	
	public void run() {
		while(true) {
			System.out.print("한글 단어 ? ");
			word = scan.next();
			if(word.equals("그만")) {
				break;
			}
			
			String result = Dictionary.kor2Eng(word);
			if(result == null) {
				System.out.println(word+"은 저의 사전에 없습니다.");
			} else {
				System.out.println(word+"은 "+result);
			}
		}
	}
	
	
}
