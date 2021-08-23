

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
	int id =Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	int age     =Integer.parseInt(request.getParameter("age"));
	int mobile =Integer.parseInt(request.getParameter("mobile"));
	
	
	try
	{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/yashmysql","root","root");
		 
		 PreparedStatement ps=con.prepareStatement("insert into servletdata values(?,?,?,?,?)");
		 ps.setInt(1, id);
		 ps.setString(2, name);
		 ps.setString(3, address);
		 ps.setInt(4, age);
		 ps.setInt(5, mobile);
		 int i =ps.executeUpdate();
		
		if(i > 0)
		 {
			out.println("inserted");
		 }
		
		
	} 
		 catch (Exception e)
		 {
			 e.printStackTrace();
			
		 }
	}

}
