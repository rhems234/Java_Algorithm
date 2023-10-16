package ex;

import java.util.Scanner;

public class Ex3_14_Test {

	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);
		String name;
		int i = 0;
		
		while(true) {
			System.out.println("과목 이름 >> ");
			name = scan.next();
			if(name.equals("그만")) break;
			
			for(i = 0; i < course.length; i++) {
				System.out.println(course[i]+"의 점수는 " +score[i]);
				break;
			}
		}
		if(i == course.length) {
			System.out.println("없는 과목입니다.");
		}
		scan.close();
	}
}
