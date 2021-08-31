

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSessionTestServlet
 */
@WebServlet("/HttpSessionTestServlet")
public class HttpSessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 * 
	 */
    Logger logger=Logger.getAnonymousLogger();
	public void init(ServletConfig config) throws ServletException {
		
		 logger.info("-----------------------------------------");	
	 logger.info("init method is called"+this.getClass().getName());
	 logger.info("-----------------------------------------");	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		sleep();
		HttpSession httpsession = request.getSession();
		sleep();
		httpsession.invalidate();
	}
	
	
	private void sleep() {
		
		try {
			Thread.sleep(12000);
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
	}


	public void destroy() 
	{
	

		logger.info("--------------------------------------------");
		 logger.info("init method called in"+this.getClass().getName());
	
	
	
	}
	
	


}
