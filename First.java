package com.srm.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		pw.write("<form action ='one'>");
		pw.write("<center><input type='text' name = 'data'></center>");
		pw.write("<center><input type='submit' value ='Sayhello'></center>");		
		pw.write("</form>");
		pw.write("<body bgcolor ='yellow'>");
		
	}

}
