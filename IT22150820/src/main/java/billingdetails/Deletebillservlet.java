package billingdetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deletebillservlet")
public class Deletebillservlet extends HttpServlet {//inheritance
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		
		boolean isTrue;
		
		isTrue = BillingDBUtil.deleteBilling(username);
		
		if (isTrue == true) {
			//if this part is true , forward this to insertbilling.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("insertbilling.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			//if this part is not true , forward this to unsuccess.jsp
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
		
	}



	}


