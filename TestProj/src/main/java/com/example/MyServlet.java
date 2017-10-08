package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		TestClass t = (TestClass) context.getBean("testClass");
		t.setId(1);
		response.getWriter().print(t.getId());
		t = (TestClass) context.getBean("testClass");
		response.getWriter().print(t.getId());
	}
}
