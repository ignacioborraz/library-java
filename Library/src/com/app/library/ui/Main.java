package com.app.library.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.library.service.BooksService;
import com.app.library.service.UsersService;

public class Main {
	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		BooksService booksService = new BooksService(library);

		ArrayList<User> users = new ArrayList<>();
		UsersService usersService = new UsersService(users);

		Scanner keyboard = new Scanner(System.in);
		int option;
		do {
			System.out.println("=== Virtual Library ===");
			System.out.println("1: Create a book");
			System.out.println("2: Register a user");
			System.out.println("3: Read books");
			System.out.println("4: Read users");
			System.out.println("5: Borrow a book");
			System.out.println("6: Return a book");
			System.out.println("0: Exit");
			System.out.println("=== Select an option ===");
			option = keyboard.nextInt();
			keyboard.nextLine();
			switch (option) {
			case 1:
				System.out.println("Enter Title");
				String title = keyboard.nextLine();
				System.out.println("Enter Author");
				String author = keyboard.nextLine();
				System.out.println("Enter Category");
				String category = keyboard.nextLine();
				System.out.println("Enter ISBN");
				String ISBN = keyboard.nextLine();
				booksService.createOne(title, author, ISBN, category);
				System.out.println("Book created!");
				break;
			case 2:
				System.out.println("Enter ID");
				String id = keyboard.nextLine();
				System.out.println("Enter Name");
				String name = keyboard.nextLine();
				usersService.createOne(name, id);
				System.out.println("User created!");
				break;
			case 3:
				System.out.println(booksService.readAll());
				break;
			case 4:
				System.out.println(usersService.readAll());
				break;
			case 5:
				System.out.println("Enter the user id");
				String idUser = keyboard.nextLine();
				User user = usersService.readOne(idUser);
				if (user != null) {
					System.out.println("Enter the book ISBN");
					String ISBNbook = keyboard.nextLine();
					Book book = booksService.readOne(ISBNbook);
					if (book != null) {
						if (book.isAvailable(book)) {
							usersService.borrowAbook(book, user);
							System.out.println("the book has been successfully lent!");
						} else {
							System.out.println("Can't be borrowed!");
						}
					} else {
						System.out.println("Book not found!");
					}
				} else {
					System.out.println("User not found!");
				}
				break;
			case 6:
				System.out.println("Enter the user id");
				String idOfUser = keyboard.nextLine();
				User one = usersService.readOne(idOfUser);
				if (one != null) {
					System.out.println("Enter the book ISBN");
					String ISBNbook = keyboard.nextLine();
					Book book = booksService.readOne(ISBNbook);
					if (book != null) {
						if (one.getBorrowedBooks().contains(book)) {
							usersService.returnAbook(book, one);
							System.out.println("the book has been successfully returned!");
						} else {
							System.out.println("Can't be borrowed!");
						}
					} else {
						System.out.println("Book not found!");
					}
				} else {
					System.out.println("User not found!");
				}
				break;
			default:
				break;
			}
		} while (option != 0);
	};
};
