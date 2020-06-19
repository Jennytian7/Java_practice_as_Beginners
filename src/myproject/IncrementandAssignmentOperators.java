package myproject;

public class IncrementandAssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x = 6;
//		x = x+1;
//		x ++; // ++x is pre increment
		
		x += 5; // x=x+5; +=, -=;
		x *= 5; // x=x*5; /=, *=, 
		
		System.out.println(x++); //6
		System.out.println(x);//7 post increament
		
		System.out.println(x--); //6
		System.out.println(x);//7 post increament
		

	}

}
