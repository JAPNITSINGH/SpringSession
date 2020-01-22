package com.accolite.web.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accolite.web.models.Users;

@Controller
@RequestMapping("/api")
public class FirstController {
	ArrayList<Users> listOfUsers;
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public @ResponseBody String sayHi() {
		return "hi";
	}
	
	@RequestMapping(value="/bye" , method=RequestMethod.GET)
	public @ResponseBody String sayBye() {
		return "Bye bro!";
	}
	
	@RequestMapping(value="/getMe", method=RequestMethod.GET)
	public @ResponseBody Users getMe() {
		Users u = new Users();
		u.setAge(20);
		u.setId(1);
		u.setName("Shabana");
		return u;
	}
	
	@RequestMapping(value="/otherUser", method=RequestMethod.POST)
	public @ResponseBody Users getAndSendUsers(@RequestBody Users u)
	{
		return u;
	}
	
//	@RequestMapping("/findUser")
//	public @ResponseBody Users getUserByName(@RequestParam String userName ) {
//		return listOfUsers.stream().filter(user -> user.getName().equals(userName)).findFirst().get();
//	}
	
	@RequestMapping(value = "/employee")
	public String getEmployeePage()
	{
		return "EmployeeList";
	}
	
	public FirstController()
	{
		listOfUsers = new ArrayList<Users>();
		Users u1 = new Users(); u1.setAge(20); u1.setId(2); u1.setName("Henry");
		Users u2 = new Users(); u2.setAge(20); u2.setId(3); u2.setName("Roudulf");
		Users u3 = new Users(); u3.setAge(20); u3.setId(4); u3.setName("Louis");
		listOfUsers.add(u1); listOfUsers.add(u2); listOfUsers.add(u3);
	}
	
}
