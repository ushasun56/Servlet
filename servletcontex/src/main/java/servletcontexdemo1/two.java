package servletcontexdemo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class two extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("------------Servlet one:Start------------------<br>");
		ServletConfig config=getServletConfig();
		out.println("value of p1- "+config.getInitParameter("p1")+"<br>");
		out.println("value of p2- "+config.getInitParameter("p2")+"<br>");
		out.println("value of p3- "+config.getInitParameter("p3")+"<br>");
		out.println("value of p4- "+config.getInitParameter("p4")+"<br>");
		
		ServletContext application=getServletContext();
		out.println("value of p5- "+application.getInitParameter("p5")+"<br>");
		
		out.println("------------Servlet one:End------------------<br>");
		
	}

}
