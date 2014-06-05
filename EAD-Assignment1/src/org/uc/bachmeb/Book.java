package org.uc.bachmeb;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity

public class Book implements Serializable {

	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name="BOOK_ID")
	private long id;
	private String bookTitle;
	private String bookISBN;
	private static final long serialVersionUID = 1L;

	public Book() {
		super();
	}   
	public String getBookTitle() {
		return this.bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}   
	public String getBookISBN() {
		return this.bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
   
}
