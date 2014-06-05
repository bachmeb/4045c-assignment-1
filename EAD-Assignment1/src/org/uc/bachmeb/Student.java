package org.uc.bachmeb;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {

	
	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name="STUDENT_ID")
	private long id;
	private String studentFirstName;
	private String studentLastName;
	private Integer studentNumber;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public String getStudentFirstName() {
		return this.studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}   
	public String getStudentLastName() {
		return this.studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}   
	public Integer getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
   
}
