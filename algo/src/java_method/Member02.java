package java_method;

class Method{
	int a = 10, b = 20;
	int add() {
		return a+b;
	}
	
	static int add(int x, int y) {
		return x+y;
	}
}

public class Member02 {

	public static void main(String[] args) {
		System.out.println(Method.add(20, 30));
		Method myMethod = new Method();
		System.out.println(myMethod.add());
	}

}