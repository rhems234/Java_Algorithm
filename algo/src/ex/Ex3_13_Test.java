package ex;

public class Ex3_13_Test {

	public static void main(String[] args) {
		
		for(int i = 1 ; i < 100; i++) {
			int left = i / 10;
			int right = i % 10;
			
			if((left == 3 || left == 6 || left == 9) && (right == 3 || right == 6 || right == 9))
				System.out.println(i+"박수 짝짝");
			else if((left == 3 || left == 6 || left == 9) && (right != 3 || right != 6 || right != 9))
				System.out.println(i+"박수 짝");
			else if((left != 3 || left != 6 || left != 9) && (right == 3 || right == 6 || right == 9))
				System.out.println(i+"박수 짝");
		}		
	}
}
