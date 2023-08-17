package com.simplilearn.session.tracking.hiddenformfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenFormServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("name");
		
		pw.print("Welcome " + name);
		
		pw.print("<br><br><form action ='hiddenfielddetail' method='post'>");
		pw.print("<input type ='hidden' name='uname' value='" + name + "'>");
		pw.print("<input type ='submit' value='submit'>");
		pw.print("</form>");
		
		pw.close();
		
	
	}

}
