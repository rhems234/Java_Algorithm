package Bronze3;

import java.util.Scanner;

public class Baek_5073 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z;
		
		while(true) {
			x = scan.nextInt();
			y = scan.nextInt();
			z = scan.nextInt();
			
			if(x == 0 && y == 0 && z == 0) {
				break;
			}
			
			if(x + y > z) {
				if(x == y && y == z && x == z) {
					System.out.println("Equilateral");
				} else if(x == y || y == z || x == z) {
					System.out.println("Isosceles");
				} else if(x != y && y != z && x != z) {
					System.out.println("Scalene");
				}
			}
			else {
				System.out.println("Invalid");
			}
		}
	}
}
