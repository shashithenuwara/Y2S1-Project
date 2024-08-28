package billingdetails;

import java.sql.Connection;//imported files
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BillingDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet rs = null;
	
	//insert
	public static boolean insertbildetails(String firstName,String lastName,String phone,String city,String country,String address,String email,String username) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBconnect.getConnection();
			stat = con.createStatement();
			//insert data to database
			String sql = "INSERT INTO billing VALUES (0, '"+firstName+"', '"+lastName+"', '"+phone+"', '"+city+"', '"+country+"','"+address+"','"+email+"','"+username+"')";

			int rs = stat.executeUpdate(sql);
			

			if(rs > 0) {//check
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}

	//validate
public static  List<Billingd> validate(String username) {
	ArrayList<Billingd> bill = new ArrayList<>();//array list
	

	try {
		con = DBconnect.getConnection();
		stat = con.createStatement();
		String sql = "select * from billing where username='"+username+"'";//select data using user name
		rs = stat.executeQuery(sql);
		
		if(rs.next()) {

		int bid = rs.getInt(1);
		String FirstName = rs.getString(2);
		String LastName = rs.getString(3);
		String Phone1 = rs.getString(4);
		String city = rs.getString(5);
		String country = rs.getString(6);
		String address = rs.getString(7);
		String email = rs.getString(8);
		String UserName = rs.getString(9);
		
		
		Billingd b = new Billingd(bid, FirstName , LastName , Phone1 , city , country , address , email , UserName);
		
		bill.add(b);
		
	}

		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return bill;
	
	
}

//update
public static boolean updatebildetails(String FirstName,String LastName,String  Phone , String city, String country, String address,String email,String username ) {
	
	try {
		
		con = DBconnect.getConnection();
		stat = con.createStatement();
		//update using sql statement
		String sql = "Update billing set firstName = '"+FirstName+"' , lastName ='"+LastName+"', phone ='"+Phone+"',city='"+city+"',country='"+country+"',address='"+address+"',email='"+email+"'where username ='"+username+"' ";
		
		int rs = stat.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	
	
	return isSuccess;
}

//delete
public static boolean deleteBilling(String username) {
	// TODO Auto-generated method stub
	
	try {
		
		con = DBconnect.getConnection();
		stat = con.createStatement();
		String sql = "delete from billing where username='"+username+"'";//delete using username
		int r = stat.executeUpdate(sql);
		
		if (r > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}

}
