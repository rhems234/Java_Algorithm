package Bronze4;

import java.util.Scanner;

public class Baek_2083 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String name = scan.next();
			int age = scan.nextInt();
			int kg = scan.nextInt();
			
			if(name.equals("#") && age == 0 && kg == 0)
				break;
			
			if(age > 17 || kg >= 80) {
				System.out.println(name+" Senior");
			} else {
				System.out.println(name+" Junior");
			}
		}
	}
}
