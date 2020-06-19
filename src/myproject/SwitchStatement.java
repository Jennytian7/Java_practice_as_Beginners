package myproject;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 10;
		
//		if (score >= 90) {
//			System.out.print("The student is pass");
//		}

		// alternative way with multiple cases
		switch (score) {
		// can include more conditions
		case 100:
		case 90:
		case 80:
			System.out.println("Very good");
			break;
		case 60:
			System.out.println("Good");
			break;
		case 30:
			System.out.println("OK");
			break;
			default:
				System.out.println("I don't know the score value");
		}
	}

}
