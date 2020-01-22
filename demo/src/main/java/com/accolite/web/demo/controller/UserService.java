package com.accolite.web.demo.controller;

import java.util.ArrayList;

import com.accolite.web.models.Users;

public class UserService {
	ArrayList<Users> listOfUsers;
	
	public Users getUser(String useName)
	{
		return listOfUsers.stream().filter(user->user.getName().equals(useName)).findFirst().get();
	}
	
}
