<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" type ="text/css" href="css/showbill.css">
<link rel ="icon" href="css/logo.jpg">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header id = "header">
	  <img src="css/logo.jpg" alt="Site Logo">
      <h1>One Click</h1>
</header>

 <nav id="nav">

      <ul>
        <li><a href="#" class="active">Home</a></li>
        <li><a href="aboutUs.php">About Us</a></li>
		<li><a href="reviews.php">Reviews</a></li>
      </ul>

     

    </nav>
   <h1>My Billing Details</h1>
    

 <c:forEach var="bill" items="${bildetails}">
	
 
 <div class="bill-details">
 
 <p><strong>Firs Name:    </strong> ${bill.firstName}</p>
 <p><strong>Last Name:      </strong>${bill.lastName}</p>
 <p><strong>Phone:     </strong>${bill.phone}</p>
 <p><strong>City:    </strong>${bill.city}</p>
 <p><strong>Country:  </strong>${bill.country}</p>
 <p><strong>Address:  </strong>${bill.address}</p>
 <p><strong>Email:  </strong>${bill.email}</p>
 <p><strong>User Name:  </strong>${bill.username}</p>
 
 
 
	
 </div>
	
	
	</c:forEach>
	
<br>
<br>
<br>
<br>
<br>	
 <br>
 <c:url value="Updatebill.jsp" var="update">
		<c:param name="FirstName" value="${firstName}"/>
		<c:param name="LastName" value="${lastName}"/>
		<c:param name="Phone" value="${phone}"/>
		<c:param name="city" value="${city}"/>
		<c:param name="country" value="${country}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="username" value="${username}"/>
		
	</c:url>
	<a href="${update}">
	<input type="button" name="insert" value="Update">
	</a>
 
 	

	<c:url value="deletebilling.jsp" var="delete">
		<c:param name="FirstName" value="${firstName}"/>
		<c:param name="LastName" value="${lastName}"/>
		<c:param name="Phone" value="${phone}"/>
		<c:param name="city" value="${city}"/>
		<c:param name="country" value="${country}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="username" value="${username}"/>
		
	</c:url>
	<a href="${delete}">
	<input type="button" name="insert" value="Delete">
	</a>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
</body>
<footer id = "footer">
<div>
          <img src="css/logo.jpg" alt="Site Logo" height="50px">
          <h3>ONE CLICK </h3>
          <p>Follow us on social media:</p>

          <div>
            <a href="https://www.facebook.com/example" target="_blank"><img src="css/facebook.jpg" alt="Facebook"></a>
            <a href="https://www.twitter.com/example" target="_blank"><img src="css/twitter.jpg" alt="Twitter"></a>
            <a href="https://www.instagram.com/example" target="_blank"><img src="css/instagram.jpg" alt="Instagram"></a>
          </div>

        </div>

        <div>
          <p>Contact us:</p>
          <p>Phone: 076999999</p>
          <p>Email: oneClick321@gmail.com</p>
        </div>
        </footer>
</html>