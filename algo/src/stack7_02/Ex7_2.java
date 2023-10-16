package stack7_02;

public class Ex7_2 {

	public static void main(String[] args) {
		char deletedItem;
		LinkedStack ls = new LinkedStack();
		
		ls.push('A');
		ls.printStack();
		
		ls.push('B');
		ls.printStack();
		
		ls.push('C');
		ls.printStack();
		
		deletedItem = ls.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item : " +deletedItem);
		ls.printStack();
	}
	
}
