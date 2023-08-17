package com.simplilearn.session.tracking.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		req.getRequestDispatcher("link.html").include(req, res);

		Cookie ck[] = req.getCookies();

		if (ck != null) {

			String username = ck[0].getValue();

			if (!username.equals("") || username != null) {
				pw.print("<br>Welcome to the profile");
				pw.print("<br>Welcome " + username);
			}
		}

		else {
			pw.print("<br>Please login first");
			req.getRequestDispatcher("login.html").include(req, res);
		}

	}

}
