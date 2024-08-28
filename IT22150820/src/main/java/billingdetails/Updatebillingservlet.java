package billingdetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Updatebillingservlet")
public class Updatebillingservlet extends HttpServlet {//inheritance
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String FirstName = request.getParameter("firstName");
		String LastName = request.getParameter("lastName");
		String Phone = request.getParameter("Phone");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		boolean isTrue;
		
		isTrue = BillingDBUtil.updatebildetails(FirstName,LastName,Phone,city,country,address,email,username);
		
		if(isTrue == true) {
			//if this part is true , forward to insertbilling.jsp
			RequestDispatcher dis = request.getRequestDispatcher("insertbilling.jsp");
			dis.forward(request, response);
		}
		
		else {
			//if this part is not true , forward it to Updatebill.jsp
			    request.setAttribute("errorMessage", "Invalid Username"); // Set an error message attribute
		        RequestDispatcher dis = request.getRequestDispatcher("Updatebill.jsp");
		        dis.forward(request, response);
		}
	}



}
