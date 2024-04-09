package com.app.library.service;

import java.util.ArrayList;

import com.app.library.ui.User;

public class UsersService {
	//PROPERTIES
	private ArrayList<User> users;
	
	//CONSTRUCTOR
	public UsersService(ArrayList<User> users) { this.users = users; }
	
	//CRUD METHODS
	public void createOne(String name, String id) {
		User user = new User(name, id);
		users.add(user);
	}
	public ArrayList<User> readAll() { return users; }
	public User readOne(String id) { 
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	public void updateOne(String newName, String id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				user.setName(newName);
			}
		}
	}
	public void destroyOne(String id) { users.removeIf(user -> user.getId().equals(id)); }
}
