package org.uc.bachmeb;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Instructor
 *
 */
@Entity

public class Instructor implements Serializable {
	
	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name="INSTRUCTOR_ID")
	private long id;
	private String instructorFirstName;
	private String instructorLastName;
	private String instructorEmailAddress;
	private static final long serialVersionUID = 1L;
		
	public Instructor() {
		super();
	} 
    
	public String getInstructorFirstName() {
		return this.instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}   
	public String getInstructorLastName() {
		return this.instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}   
	public String getInstructorEmailAddress() {
		return this.instructorEmailAddress;
	}

	public void setInstructorEmailAddress(String instructorEmailAddress) {
		this.instructorEmailAddress = instructorEmailAddress;
	}
   
}
