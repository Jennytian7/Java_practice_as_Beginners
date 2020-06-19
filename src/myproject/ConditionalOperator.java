package myproject;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Another way of is-else statement
		int age = 54;
		
		System.out.println(age > 50 ? "You are old" : "You are young" );
		// condition? if yes: else no
		
		//Logical operator
		int maths = 60;
		int sci = 25;
		int phy = 45;
		
		
		String str = "tian zhu"	;
		System.out.println(str);
		
		// && and, || or,
		if ((maths >= 35) && (sci >= 35) || phy >= 35) {
			System.out.println("The student is pass.");
		}else {
			System.out.println("The student is pass only 1 subject or fails.");
		}
		
		
		if ((maths >= 35) || (sci >= 35) ) {
			System.out.println("The student is pass.");
		}else {
			System.out.println("The student is pass only 1 subject or fails.");
		}
		
	}

}
