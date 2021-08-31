

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HellowWordServlet
 */
@WebServlet("/HellowWordServlet")
public class HellowWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HellowWordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	Logger logger=Logger.getAnonymousLogger();
	public void init(ServletConfig config) throws ServletException {
		logger.info("--------------------------------------------");
	           logger.info("init method called in"+this.getClass().getName());
	           logger.info("--------------------------------------------");
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("doget is called"+this.getClass().getName());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("login successfully<br>");
	}
	
	public void destroy()
	{
		logger.info("--------------------------------------------");
		 logger.info("init method called in"+this.getClass().getName());
	}

}
