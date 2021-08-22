

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Fibonacci")
public class Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		int n1=0,n2=1,n3,i,count=10;  
		 out.println(n1+" "+n2);//printing 0 and 1  
		  
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
		 {  
		  n3=n1+n2;  
		  out.println(" "+n3);  
		  n1=n2;  
		  n2=n3;  
		 }  


}
}
