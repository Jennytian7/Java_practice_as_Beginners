package myproject;

public class student {
	
	// constructor
	String studentName;
	String lastName;
	
	public student(String name, String last) {
		studentName = name;
		lastName = last;
	}// constructor; read in name
	
	public String getName() {
		return studentName + lastName;
	}
	
	public void saying() {
		System.out.println("Your name is "+ getName());
	}
	
	// above is for constructor
	
	
	
//	int id;
//	String name;
//	int age;
//	
	//get and set methods
//	// select any var, go to source-generate setters and getters-select all-generate
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
	

}
