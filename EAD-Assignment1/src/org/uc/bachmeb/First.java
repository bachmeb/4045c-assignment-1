package org.uc.bachmeb;

class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		Student student = new Student("Brian","Bachmeyer","bachmeb@mail.uc.edu");
		
		System.out.println("First Name: " + student.firstName);
		System.out.println("Last Name: " + student.lastName);
		System.out.println("Email Address: " + student.emailAddress);
		
	}

}
