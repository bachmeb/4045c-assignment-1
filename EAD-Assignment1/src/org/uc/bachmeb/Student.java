package org.uc.bachmeb;

public class Student {
	
public String firstName;
public String lastName;
public String emailAddress;

public Student(String first, String last, String email){
	setFirstName(first);
	setLastName(last);
	setEmailAddress(email);
	
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}


}
