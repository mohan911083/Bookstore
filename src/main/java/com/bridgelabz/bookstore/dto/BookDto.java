package com.bridgelabz.bookstore.dto;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class BookDto {
	private String bookName;
	private Long noOfBooks;
	private Double price;
	private String authorName;
	private String image;
	private String bookDetails;
	private String userId;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Long getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(Long noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(String bookDetails) {
		this.bookDetails = bookDetails;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/*public void setAuthorName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setBookDetails(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setBookName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setImage(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPrice(double d) {
		// TODO Auto-generated method stub
		
	}
	public void setNoOfBooks(long l) {
		// TODO Auto-generated method stub
		
	}*/
	
}