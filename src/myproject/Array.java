package myproject;

public class Array {

	public static void main(String[] args) {
		
//		// Introduction to Array
//		int num[]= new int[4]; //initialization, new type[size]; only store 4 values
//		num[0] = 45;
//		num[1] = 658;
//		num[2] = 5;
//		num[3] = 65;
//		
//		System.out.println(num[1]);
//		
//		int num2[] = {1, 25, 6, 9};
//		System.out.println(num2[3]);// index start from 0
//		
//		
//		//Creating a Java Table
//		System.out.println("Index\tValue"); // \t give space in between 
//		
//		int num3 [] = {12, 3, 5};
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(i+"\t" + num3[i]);
//		} // property .length
		
		
		
		// Summary Arrays
		int num4[] = {2,5,9};
		int sum = 0;
		
		for (int i = 0; i < num4.length; i++ ) {
			sum += num4[i];
		}
		System.out.println("Sum = " + sum);
		
		
	}

}
