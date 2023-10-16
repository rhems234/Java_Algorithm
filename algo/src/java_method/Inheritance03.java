package java_method;

class Parent2{
	int a = 10;
}

class Child2 extends Parent2{
	int a = 20;
	
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Inheritance03 {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.display();

	}

}
