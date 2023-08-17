package com.simplilearn.session.tracking.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlRewriteServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("name");
		
		pw.print("Welcome " + name);
		
		// This URL is created to redirect to another servlet
		pw.print("<a href='userdetail?uname=" + name + "'> User Detail</a>");
		
		pw.close();
		
	}

}
