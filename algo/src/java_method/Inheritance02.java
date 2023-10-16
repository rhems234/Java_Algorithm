package java_method;

class Parent1{
	int a = 10;
}

class Child1 extends Parent1{
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Inheritance02 {

	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.display();

	}

}
