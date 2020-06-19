package myproject;

import java.util.Scanner;

public class CreateAbasicCalculator {

	public static void main(String[] args) {
		// TODO calculater
		
		Scanner scan = new Scanner(System.in);
		
		double firstNumber, secondNumber, answer;
		
		System.out.println("Enter first number：");
		firstNumber = scan.nextDouble();
		
		System.out.println("Enter the second number:");
		secondNumber = scan.nextDouble();
		
		answer = firstNumber + secondNumber;
		
		System.out.println("Sum of the two number is:" + answer);
//		System.out.println(answer);
		
		
		
	}

}
