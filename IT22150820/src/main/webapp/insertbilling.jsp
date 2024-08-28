<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" type ="text/css" href="css/addbilling.css">
<link rel ="icon" href="css/logo.jpg">
<meta charset="ISO-8859-1">
<title>Billing Details</title>
</head>
<body>
<header id="header">
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
    
    <div id="messageContainer">
        <!-- The message will be displayed here -->
    </div>
    
    <div class="container">
    <h1>Billing Details</h1>
    
     
        
    <form action="insert" method="post"> 
    
    
         <label for="firstName">First Name:</label>
         <input type="text" name="firstName" ><br>
         <br>
        
         <label for="lastName">Last Name:</label>
         <input type="text" name="lastName" ><br>
         <br>
        
         <label for="Phone">Phone:</label>
         <input type="text" name="Phone" ><br>
         <br>
        
         <label for="city">City:</label>
         <input type="text" name="city"  ><br>
         <br>
        
         <label for="country">Country:</label>
         <input type="text" name="country" ><br>
         <br>
        
        <label for="address">Address:</label>
         <input type="text" name="address"  ><br>
         <br>
         
         <label for="email">Email:</label>
         <input type="text" name="email" ><br>
         <br>
         
         <label for="username">UserName:</label>
         <input type="text" name="username" ><br>
         <br>
         <br>
        
        <input type="submit" name="submit" value="Save">
        <br>
        
        
      </form>  
       
    </div>
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
