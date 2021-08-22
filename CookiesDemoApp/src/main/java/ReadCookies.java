

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookies")
public class ReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 Cookie[] cookies=request.getCookies();
		 PrintWriter out=response.getWriter();
		 if(cookies!=null) {
			 for(Cookie cookie : cookies) {
				out.println("Cookie ---->"+cookie.getName()+",Cookie Value-->"+cookie.getValue()+""); 
			 }
		 }
		 
	}

}
