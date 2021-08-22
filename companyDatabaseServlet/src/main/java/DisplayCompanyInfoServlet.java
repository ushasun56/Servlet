

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayCompanyInfoServlet")
public class DisplayCompanyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig servletConfig=getServletConfig();
		
		String cName=servletConfig.getInitParameter("companyName");
		String cEmail=servletConfig.getInitParameter("email");
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<h2>Company Name :"+ cName+"</h2><br>");
		out.println("<h2>Company Email :"+ cEmail+"</h2><br>");
	}

}
