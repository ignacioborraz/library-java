package com.app.library.ui;

import java.util.ArrayList;

public class User {

	// PROPERTIES
	private String name;
	private String id;
	private ArrayList<Book> borrowedBooks;

	// CONSTRUCTOR
	public User(String name, String id) {
		this.name = name;
		this.id = id;
		this.borrowedBooks = new ArrayList<>();
	}

	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// METHODS
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", borrowedBooks=" + borrowedBooks + "]";
	}

	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

}
