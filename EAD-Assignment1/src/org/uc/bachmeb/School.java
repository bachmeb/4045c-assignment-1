package org.uc.bachmeb;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: School
 *
 */
@Entity

public class School implements Serializable {

	
	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name="SCHOOL_ID")
	private long id;
	private String schoolName;
	private String schoolAddress;
	private Integer schoolEnrollment;
	
	//@OneToMany(mappedBy="school", cascade= CascadeType.ALL)  
    //private ArrayList<Course> courses; 
	
	private static final long serialVersionUID = 1L;

	public School() {
		super();
	}   
	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}   
	public String getSchoolAddress() {
		return this.schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}   
	public Integer getSchoolEnrollment() {
		return this.schoolEnrollment;
	}

	public void setSchoolEnrollment(Integer schoolEnrollment) {
		this.schoolEnrollment = schoolEnrollment;
	}
   
}
