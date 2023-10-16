package java_test;

public class ArrayUtil {

	public static int [] concat(int[] a, int[] b) {
		int[] array = new int[a.length+b.length];
		
		for(int i = 0; i < a.length; i++) {
			array[i] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			array[a.length+i] = b[i];
		}
		return array;
	}
	
	public static void print(int[] a) { // 배열 a 출력
		System.out.print("{ ");
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("}");
	}
}
