
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.Statement;

@WebServlet("/ServletDatabaseData")
public class ServletDatabaseData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String ID = request.getParameter("id");
		out.print("<h1>Display The record From Database</h1>");
		out.println("<table border='1'><tr><th>id</th><th>name</th><th>address</th><th>age</th><th>mobile</th></tr>");
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.jdbc.Driver"); // ....... Loading Drivers
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashmysql", "root",
					"root");

			Statement st = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery("select * from servletdata where id=" + ID + "");

			while (rs.next()) {
				out.print("<tr><td>");
				out.println(rs.getInt(1));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getInt(4));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getInt(5));
				out.print("</td>");
				out.print("</tr>");

			}

		} catch (Exception p) {
			p.printStackTrace();
		}
		out.print("</table>");

	}

}
