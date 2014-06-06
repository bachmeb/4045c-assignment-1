package org.uc.bachmeb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		StudentOld studentOld = new StudentOld("Brian","Bachmeyer","bachmeb@mail.uc.edu");
		
		System.out.println("First Name: " + studentOld.firstName);
		System.out.println("Last Name: " + studentOld.lastName);
		System.out.println("Email Address: " + studentOld.emailAddress);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EAD-Assignment1");
		EntityManager em = factory.createEntityManager();

		School school = new School();
		school.setSchoolName("George Washington");
		school.setSchoolEnrollment(1000);		
		em.getTransaction().begin();em.persist(school);
		em.getTransaction().commit();
		
		school = new School();
		school.setSchoolName("Abraham Lincoln");
		school.setSchoolEnrollment(2000);		
		em.getTransaction().begin();em.persist(school);
		em.getTransaction().commit();

		Course course = new Course();
		course.setCourseTitle("Math");
		course.setCourseNumber(101);		
		em.getTransaction().begin();em.persist(course);
		em.getTransaction().commit();
		
		course = new Course();
		course.setCourseTitle("Science");
		course.setCourseNumber(101);		
		em.getTransaction().begin();em.persist(course);
		em.getTransaction().commit();

		Book book = new Book();
		book.setBookISBN("012345679");
		book.setBookTitle("Math Book");		
		em.getTransaction().begin();em.persist(book);
		em.getTransaction().commit();

		Student student = new Student();
		student.setStudentFirstName("Thomas");
		student.setStudentLastName("Jefferson");
		student.setStudentFirstName("Thomas Jefferson");
		em.getTransaction().begin();em.persist(student);
		em.getTransaction().commit();

		Instructor instructor = new Instructor();
		instructor.setInstructorEmailAddress("john.adams@example.com");	
		em.getTransaction().begin();em.persist(instructor);
		em.getTransaction().commit();
		
		
		Student foundStudent = em.find(Student.class, new Integer(123));
		
		
		System.out.println("em First Name: " + foundStudent.getStudentFirstName());
		System.out.println("em Last Name: " + foundStudent.getStudentLastName());
		
	}

}
