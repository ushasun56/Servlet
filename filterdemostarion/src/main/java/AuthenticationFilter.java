

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {


 Logger logger=Logger.getAnonymousLogger();
	public void init(FilterConfig fConfig) throws ServletException {
		logger.info("--------------------------------------------");
		logger.info("init method is called in "+this.getClass().getName());
		logger.info("--------------------------------------------");
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		logger.info("doFilter Method Is Called"+this.getClass().getName());
		
		HttpServletRequest req =(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse)response;
		
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		
		if(!(userName.equals("admin") && passWord.equals("admin"))) {
			logger.info("---------------------------------");
			
			logger.info("Unauthorized request");
			logger.info("---------------------------------");
		     res.sendRedirect("index.html");
		}
		else {
			 
			chain.doFilter(req, res);  
		}
		
	}

	

      public void destroy()
      {
    	  logger.info("--------------------------------------------");
		
	}


}
