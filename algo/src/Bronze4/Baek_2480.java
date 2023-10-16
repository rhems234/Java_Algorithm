package Bronze4;

import java.util.Scanner;

public class Baek_2480 {

	public static void main(String[] args) {
		int x, y, z;
		
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		
		if(x == y && y == z && x == z) {
			System.out.println(10000+x*1000);
		} else if(x==y || x==z) {
			System.out.println(1000+x*100);
		} else if(y==z) {
			System.out.println(1000+y*100);
		} else if(x > y && x > z){
			System.out.println(x*100);
		} else if(y > x && y > z) {
			System.out.println(y*100);
		} else if(z > x && z > y) {
			System.out.println(z*100);
		}
	}

}
