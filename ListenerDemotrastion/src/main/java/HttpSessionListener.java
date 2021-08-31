

import java.util.logging.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class HttpSessionListener
 *
 */
@WebListener
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {
     
	Logger logger=Logger.getAnonymousLogger();
	
    public void sessionCreated(HttpSessionEvent se) 
    { 
      logger.info("-------------------------------------"); 
      
 	 logger.info("session created method has been called in"+this.getClass().getName());
 	 logger.info("-----------------------------------------");	
 	 
 	
	HttpSession session = se.getSession();
	logger.info(session +"created");
	logger.info("ID=" +session.getId()+"MaxInactiveInterval="+session.getMaxInactiveInterval());
	
   }

    public void sessionDestroyed(HttpSessionEvent se)
    { 

        logger.info("-------------------------------------"); 
        
   	 logger.info("session destroyed method has been called in"+this.getClass().getName());
   	 logger.info("-----------------------------------------");	
   	 
   	HttpSession session = se.getSession();
	logger.info(session +"destroyed");
	logger.info("ID=" +session.getId()+"MaxInactiveInterval="+session.getMaxInactiveInterval());
    	
    }
	
}
