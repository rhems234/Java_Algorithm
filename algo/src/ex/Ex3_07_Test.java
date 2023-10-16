package ex;

public class Ex3_07_Test {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int sum = 0;
		System.out.print("랜덤한 정수들 : ");
		for(int j = 0; j < 10; j++) {
			int i = (int)(Math.random()*10+1);
			arr[j] = i;
			sum += arr[j];
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("평균 : "+(float)(sum/10));
	}

}
