package com.simplilearn.session.tracking.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServletHttpSession extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		req.getRequestDispatcher("link.html").include(req, res);

		

		HttpSession session = req.getSession();
		
		session.invalidate();

		pw.print("<br>You are successfully logged out");

		pw.close();

	}

}
