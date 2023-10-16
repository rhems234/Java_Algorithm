package java_method;

class Parent3{
	int a;
	Parent3() {
		a = 10;
	}
	Parent3(int n ){
		a = n;
	}
}

class Child3 extends Parent3{
	int b;
	Child3(){
		//super(40);
		b = 20;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class Inheritance04 {

	public static void main(String[] args) {
		Child3 ch = new Child3();
		ch.display();

	}

}
