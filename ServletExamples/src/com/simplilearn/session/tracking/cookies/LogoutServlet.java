package com.simplilearn.session.tracking.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		req.getRequestDispatcher("link.html").include(req, res);

		// Replacing the username with the empty string after logout
		Cookie ck = new Cookie("uname", "");

		// Expiring the cookie
		ck.setMaxAge(0);

		res.addCookie(ck);

		pw.print("<br>You are successfully logged out");

		pw.close();

	}

}
