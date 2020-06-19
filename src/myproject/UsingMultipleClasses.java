package myproject;

import java.util.Scanner;

public class UsingMultipleClasses {

	public static void main(String[] args) {
		// Methods
//		myclass2 myclass2Object = new myclass2();// class name here: myclass2Object; 
//		//from myclass2 import... as myclass2Object
//		myclass2Object.message();//call the message funtion in the mycalss2 class
//		myclass2Object.message1();//call the message funtion in the mycalss2 class

		
		
//		// Methods and Parameters
//		Scanner input = new Scanner(System.in);// get input
//		
//		myclass2 myclass2Object = new myclass2();// class name here: myclass2Object; 
//		
//		System.out.println("Enter your name");
//		String name = input.nextLine();
//	
//		myclass2Object.message2(name);//call the message funtion in the mycalss2 class
		
//		//Methods and Instances
//		// multiple objects is called instances
//		student stu1 = new student(); // stu1 is an object of class student
//		stu1.id = 1;
//		stu1.name = "Tom";
//		stu1.age = 15;
//		
//		System.out.println(stu1.name + " is "+ stu1.age + " yeasr old.");
//		
//		student stu2 = new student();
//		stu2.id = 2;
//		stu2.name = "John";
//		stu2.age = 17;
//		
//		System.out.println(stu2.name + " is "+ stu2.age + " yeasr old.");
//		
		
		// set and get method
		student stu1 = new student(); // stu1 is an object of class student
		stu1.setId(1);
		stu1.setName("Tom");
		stu1.setAge(15);
		
		System.out.println(stu1.getName() + " is "+ stu1.getAge() + " yeasr old.");
		
		student stu2 = new student();
		stu2.setId(2);
		stu2.setName("John");
		stu2.setAge(17);
		
		System.out.println(stu2.getName() + " is "+ stu2.getAge() + " yeasr old.");

	}

}
