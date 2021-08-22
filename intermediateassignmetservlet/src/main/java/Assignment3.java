

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment3
 */
@WebServlet("/Assignment3")
public class Assignment3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Calendar calendar = new GregorianCalendar();
	      String am_pm;
	      int hour = calendar.get(Calendar.HOUR);
	      int minute = calendar.get(Calendar.MINUTE);
	      int second = calendar.get(Calendar.SECOND);
	      int date   = calendar.get(calendar.DATE);
	      int month   = calendar.get(calendar.MONTH);
	      int year  = calendar.get(calendar.YEAR);
	    
	      PrintWriter out = response.getWriter();
	      out.println("time :"+hour+":"+minute+":"+second);
	      out.println("Today Date:"+date+":"+month+":"+year);
	}

}
