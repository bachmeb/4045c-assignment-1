package org.uc.bachmeb;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course implements Serializable {

	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name="COURSE_ID")
	private long id;
	private String courseTitle;
	private Integer courseNumber;
	private static final long serialVersionUID = 1L;

	public Course() {
		super();
	}   
	    
	public String getCourseTitle() {
		return this.courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}   
	public Integer getCourseNumber() {
		return this.courseNumber;
	}

	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}
   
}
