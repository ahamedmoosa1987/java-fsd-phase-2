package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DummyServlet extends HttpServlet {

	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException {
	
		String name = httpServletRequest.getParameter("username");
		String password = httpServletRequest.getParameter("password");
		
		httpServletResponse.setContentType("text/html");

		PrintWriter pw = httpServletResponse.getWriter();
		
		if(password.equalsIgnoreCase("admin123"))
		{
			pw.println("<html><body>");
			pw.println("Welcome " + name + " to my servlet !");
			pw.println("<html><body>");
		}
		
		else
		{
			pw.println("<html><body>");
			pw.println("You have entered wrong password");
			pw.println("<html><body>");
		}
		

		pw.close(); 

	}

}
