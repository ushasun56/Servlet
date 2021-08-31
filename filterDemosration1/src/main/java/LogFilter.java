

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter("/LogFilter")
public class LogFilter implements Filter {

	public LogFilter() {
	       
    }

	Logger logger=Logger.getAnonymousLogger();

	public void init(FilterConfig fConfig) throws ServletException {
		logger.info("--------------------------------------------");
		logger.info("init method is called in "+this.getClass().getName());
		logger.info("--------------------------------------------");
	}


	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		logger.info("doFilter Method Is Called"+this.getClass().getName());
		PrintWriter out= res.getWriter();
		HttpServletRequest request =(HttpServletRequest) req;
		
		String ipAddress = request.getRemoteAddr();
		
		logger.info("Ip "+ ipAddress+",Time"+new Date().toString());
		out.println("Log Filter Is invoked Before<br>");
		out.println("Ipaddress:"+ipAddress+"Time&date:"+new Date().toString()+"<br>");
		
		chain.doFilter(req, res);
	}


	public void destroy() 
	{
		logger.info("--------------------------------------------");
		logger.info("distroy method is called in"+this.getClass().getName());
	
	}
	
}
