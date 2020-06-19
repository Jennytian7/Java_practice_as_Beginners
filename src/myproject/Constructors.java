package myproject;

public class Constructors {

	public static void main(String[] args) {
		// constructor: a block of method
		student stu1 = new student("Mark", "England"); // with args
		student stu2 = new student("Tom", "US"); // with args
		stu1.saying();
		stu2.saying();
	}

}
