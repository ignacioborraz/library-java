package com.app.library.service;

import java.util.ArrayList;

import com.app.library.ui.Book;

public class BooksService {
	
	//PROPERTIES
	private ArrayList<Book> library;
	
	//CONSTRUCTOR
	public BooksService(ArrayList<Book> library) { this.library = library; }
	
	//CRUD METHODS
	public void createOne(String title, String author, String ISBN, String category) {
		Book book = new Book(title, author, ISBN, category);
		library.add(book);
	}
	public ArrayList<Book> readAll() { return library; }
	public Book readOne(String ISBN) { 
		for (Book book : library) {
			if (book.getISBN().equals(ISBN)) {
				return book;
			}
		}
		return null;
	}
	public void updateOne(String newTitle, String newAuthor, String ISBN, String newCategory) {
		for (Book book : library) {
			if (book.getISBN().equals(ISBN)) {
				book.setTitle(newTitle);
				book.setAuthor(newAuthor);
				book.setCategory(newCategory);
			}
		}
	}
	public void destroyOne(String ISBN) { library.removeIf(book -> book.getISBN().equals(ISBN)); }
}
