package com.srm.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("data");
		pw.write("hellooo...."+name);
		
	}

}
