package java_test;

import java.util.Scanner;

public class PhoneBook {
	
	Scanner scan = new Scanner(System.in);
	Phone phone[];
	int num;
	String name;
	String tel;
	
	public void getNum() {
		System.out.println("인원수 >> ");
		num = scan.nextInt();
		phone = new Phone[num];
	}
	
	public void getInfo() {
		for(int i = 0; i < num; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			name = scan.next();
			tel = scan.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다.");
	}
	
	public void Search() {
		boolean state = false;
		while(true) {
			System.out.println("검색할 이름 >> ");
			name = scan.next();
			
			if(name.equals("그만")) {
				break;
			}
			
			for(int i = 0; i < num; i++) {
				if(name.equals(phone[i].getName())) {
					System.out.println(name+"의 번호는 "+phone[i].getTel());
					state = true;
				}
			}

			if(state == false) {
				System.out.println(name+"이 없습니다.");
			}
		}
	}
	
	public void run() {
		
		
	}

}
