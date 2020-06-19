package myproject;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// random number generator
		Random dise = new Random(); // ddefine dise as random class
		int number;
		
		for (int counter = 0; counter <= 8; counter ++) {
			number = 1+ dise.nextInt(6); 
			System.out.println(number);
		}//6 values to choose

	}

}
