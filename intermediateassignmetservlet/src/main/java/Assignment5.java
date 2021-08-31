

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment5
 */
@WebServlet("/Assignment5")
public class Assignment5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count;
	 public void init() throws ServletException {
		    // Try to load the initial count from our saved persistent state
		 
		    FileReader fileReader = null;
		    BufferedReader bufferedReader = null;
		    try {
		      fileReader = new FileReader("InitDestroyCounter.initial");
		      bufferedReader = new BufferedReader(fileReader);
		      String initial = bufferedReader.readLine();
		      count = Integer.parseInt(initial);
		      return;
		    }
		    catch (FileNotFoundException ignored) { }  // no saved state
		    catch (IOException ignored) { }            // problem during read
		    catch (NumberFormatException ignored) { }  // corrupt saved state
		    finally {
		      // Make sure to close the file
		      try {
		        if (bufferedReader != null) {
		          bufferedReader.close();
		        }
		      }
		      catch (IOException ignored) { }
		    }

		   
		    String initial = getInitParameter("initial");                    
		    try {                                                            
		      count = Integer.parseInt(initial);                             
		      return;                                                        
		    }                                                                
		    catch (NumberFormatException ignored) { }  // null or non-integer value
		                                                                     
		                           
		    count = 0;                                                       
		  }                                        
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/plain");                                
		    PrintWriter out = response.getWriter();                               
		    count++;                                                         
		    out.println("Since the beginning, this servlet has been accessed " +
		                count + " times.");                                  
		  }                                                                  
		                                                                     
		  public void destroy() {                                            
		    super.destroy();  
		    saveState();                                                     
		  }                                                                  
		                                                                     
		  public void saveState() {                                          
		                                
		    FileWriter fileWriter = null;
		    PrintWriter printWriter = null;
		    try {                                                            
		      fileWriter = new FileWriter("InitDestroyCounter.initial");
		      printWriter = new PrintWriter(fileWriter);         
		      printWriter.println(count);                                  
		      return;                                                        
		    }                                                                
		    catch (IOException e) {               
		                             
		    }
		    finally {
		    
		      if (printWriter != null) {
		        printWriter.close();
		      }
		    }
	}

}
