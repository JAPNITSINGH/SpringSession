package com.accolite.web.demo.controller;

import java.util.ArrayList;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.web.models.Users;

@RestController
@Aspect
public class SecondController {
	ArrayList<Users> listOfUsers = new ArrayList<Users>();
	SecondController()
	{
		Users u1 = new Users();
		u1.setName("Name"); u1.setAge(20); u1.setId(1);
		listOfUsers.add(u1);
	}
	
	
	@GetMapping("/user")
//	@RequestMapping(value="/user", method=RequestMethod.GET)
//  @AfterThrowing("execution (public * *())")
	public Users getUserByName(@RequestParam String name) throws Exception
	{
		return listOfUsers.stream().filter(user->user.getName().equals(name)).findFirst().get();
	}
	
//	@Autowired
//	private UserService userService;

}
