package myproject;

public class WhileLoop {

	public static void main(String[] args) {
		
		// while loop
		int counter = 20;
//		while (counter <10) {
//			System.out.println(counter);
//			counter ++; // post operator
//		}
		
		//Do while loop
		
		do {
			System.out.println(counter);
			counter ++; // do first and check condition later; so 20 is printed
		}while (counter <10);//if true return to do;
		

	}

}
