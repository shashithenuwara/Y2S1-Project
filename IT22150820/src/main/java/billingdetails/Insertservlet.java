package billingdetails;

import java.io.IOException;//import files

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Insertservlet")
public class Insertservlet extends HttpServlet {//inherihance part
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
				String FirstName = request.getParameter("firstName");
				String LastName = request.getParameter("lastName");
				String Phone = request.getParameter("phone");
				String city = request.getParameter("city");
				String country = request.getParameter("country");
				String address = request.getParameter("address");
				String email = request.getParameter("email");
				String username = request.getParameter("username");
				
				
				boolean isTrue;
				
				isTrue = BillingDBUtil.insertbildetails(FirstName,LastName,Phone,city,country,address,email,username);
				
				if(isTrue == true) {//check
					//if boolean statement true ,forward it to success.jsp
					request.setAttribute("error_message", "Details added Successfully !!");
					RequestDispatcher dis = request.getRequestDispatcher("Success.jsp");
					dis.forward(request, response);
				}else {
					//if  boolean statement is not success forward to insertbilling.jsp
					request.setAttribute("error_message", "Error occured !!");
		            RequestDispatcher errorDis = request.getRequestDispatcher("insertbilling.jsp");
		            errorDis.forward(request, response);
				}
			}
	

}
