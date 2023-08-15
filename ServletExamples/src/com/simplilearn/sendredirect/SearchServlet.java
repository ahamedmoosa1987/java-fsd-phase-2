package com.simplilearn.sendredirect;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		
		res.sendRedirect("https://www.google.com/search?q=" + name);
		
	}

}
