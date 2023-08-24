package com.simplilearn.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenticationFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fchain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("user");
		
		System.out.println(name + " user entered in authentication filter...");
		
		String password = req.getParameter("pass");
		
		if(password.equals("admin")) {
			fchain.doFilter(req, res); // here we are sending the req to the next resource in the chain
		}
		else {
			pw.print("<br><br>Incorrect Password Entered !!!<br><br>");
			req.getRequestDispatcher("index.html").include(req, res);
		}
		
	}

}
