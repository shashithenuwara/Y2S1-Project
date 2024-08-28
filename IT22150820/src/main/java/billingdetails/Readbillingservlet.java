package billingdetails;

import java.io.IOException;//imported files
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Readbillingservlet")
public class Readbillingservlet extends HttpServlet {//inheritance part
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");//get parameter
		
		try {
			 if (username != null) {
		            List<Billingd> bildetails = BillingDBUtil.validate(username);
		            request.setAttribute("bildetails", bildetails);
		            RequestDispatcher dis = request.getRequestDispatcher("showbillingdetails.jsp");
		            dis.forward(request, response);
		        } else {
		            // Handle the case where the username is null
		        	 RequestDispatcher dis = request.getRequestDispatcher("insertbilling.jsp");
		             dis.forward(request, response);
		        }
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	}



    
