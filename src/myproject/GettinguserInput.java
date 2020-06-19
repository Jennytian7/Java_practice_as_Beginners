package myproject;

import java.util.Scanner;

public class GettinguserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name?");
	
	String name = scan.nextLine(); // read the input from user
	
	System.out.println("Hi" + name);
	//System.out.println(name);
	
	// next example
	Scanner scan1 = new Scanner(System.in);
	
	System.out.println("What is your age?");
	int age = scan1.nextInt();
	
	System.out.println("Your age is " + age);
	
		
	}

}
