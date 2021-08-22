

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckNumber")
public class CheckNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("text1"));
		for(int num1=1;num1<=100;num1++){
	        if(num1 % 2 == 0) {
	        	out.println("number is even"+num1);
	        }
	        
	        else {
	        	out.println("number is odd"+num1);
	        }
		}
	
	}
}
