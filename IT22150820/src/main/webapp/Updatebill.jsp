<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" type ="text/css" href="css/update.css">
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

 
   
 <form action="update" method="post">
    
         <label for="type">First Name:</label>
         <input type="text" name="FirstName" value=""><br>
         <br>
        
         <label for="number">Last Name:</label>
         <input type="text" name="LastName" value=""><br>
         <br>
        
         <label for="Phone">Phone:</label>
         <input type="text" name="Phone" value=""><br>
         <br>
        
         <label for="city">City:</label>
         <input type="text" name="city" value=""><br>
         <br>
        
         <label for="country">Country:</label>
         <input type="text" name="country" value=""><br>
         <br>
        
        <label for="address">Address:</label>
         <input type="text" name="address" value=""> <br>
         <br>
         
         <label for="email">Email:</label>
         <input type="text" name="email" value=""><br>
         <br>
         
         <label for="username">UserName:</label>
         <input type="text" name="username" value=""><br>
         <br>
         <br>
        
        <input type="submit" name="submit" value="Save">
        <br>
        
        
        
       
    </form>
    
    
    
	 <footer id="footer">

	
      <div>
            <img src="css/logo.jpg" alt="Site Logo" height="50px">
            <h3>ONE CLICK</h3>
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
	
	
	
</body>
</html>