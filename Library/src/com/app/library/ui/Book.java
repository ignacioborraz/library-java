package com.app.library.ui;

import java.util.ArrayList;

public class Book {

	// PROPERTIES
	private String title;
	private String author;
	private String ISBN;
	private String category;
	private Boolean available;

	// CONSTRUCTOR
	public Book(String title, String author, String ISBN, String category) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.category = category;
		this.available = true;
	}

	// GETTERS & SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	// METHODS
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", category=" + category
				+ ", available=" + available + "]";
	}

	public boolean isAvailable(Book book) {
		return book.getAvailable();
	}

}
