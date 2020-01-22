package com.accolite.web.servlet;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accolite.web.models.Users;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		ObjectMapper mapper=new ObjectMapper();
		Users myUser =new Users();
		myUser.setAge(20);
		myUser.setId(1);
		myUser.setName("Deep");
		String str=mapper.writeValueAsString(myUser);
		response.getWriter().write(str);
		//response.getWriter().write("THis response is from my first Servelet!!!");
	}
	
//	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
//	{
//		ObjectMapper mapper = new ObjectMapper();
//		Users myUser = new Users();
//		myUser.setAge(20);
//		myUser.setId(2);
//		myUser.setName("John");
//		String str = mapper.writeValueAsString(myUser);
//		response.getWriter().write(str);
//	}
	
	

}
