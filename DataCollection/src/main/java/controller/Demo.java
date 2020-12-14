package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo implements Servlet{

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("iam in service layer of DataCollection project");
		String name=req.getParameter("name");
		String number =req.getParameter("number");
		String email =req.getParameter("email");
		String password =req.getParameter("password");
		System.out.println(name);
		System.out.println(number);
		System.out.println(email);
		System.out.println(password);
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
