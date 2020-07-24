<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Mzamomtsha Primary School About Us Page</title>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <link rel='stylesheet' type='text/css' href='main.css'>
    <link rel="icon" href="Images/Head/headSchoolLogo.png">
</head>
<body  style="background-color: #5D5C61;">
    <div id="header">
            <div id="schoolLogo">  
                <img src="Images/Head/headSchoolLogo.png" alt="School badge">
            </div>         
    <div id="heading">
        <span class="schoolName">Mzamomtsha Primary School</span>
   </div>
   <div id="navHolder">
        <a class="navLink" href="index.jsp"><div class="navBar">Home</div></a>
        <a class="navLink" href="aboutUs.jsp"><div class="navBar">About</div></a>
        <a class="navLink" href="eventsPageNewerDesign.jsp"><div class="navBar">Events</div></a>
        
        <a class="navLink" href="login.jsp"><div class="navBar">LogIn</div></a>
        <a class="navLink" href="enrollmentForm.jsp"><div class="navBar">Enroll</div></a>
   </div> 
</div>
    <iframe id="aboutUsFrame" src="enrollmentFrame.jsp" style="background-color: #c2bdb0;"></iframe>

<div class="links">
    <div style="padding-top: 4px;"><a class="socialShower">Connect with us:</a></div><!--Social Media links to various social media networking platforms-->
        <div><a class="socialLink" href="https://twitter.com/"><img src="Images/Header/twitter.png" alt="Twitter" width="27px" height="27px"></div>
        <div><a class="socialLink" href="https://www.facebook.com/"><img src="Images/Header/facebook.png" alt="Facebook" width="27px" height="27px"></div>
        <div><a class="socialLink" href="https://www.instagram.com/"><img src="Images/Header/instagram.png" alt="Instagram" width="27px" height="27px"></div>
    </div>
    <div id="footer">
        <div style="justify-self: flex-start;"><a class="socialLink" href="https://rclfoods.com/brand/ouma/"
            style="margin-right: 5px;background-color: #C5C1C0;">Proudly Sponsored by Dip 'n Ouma</a>
        </div>
           <div style="padding-top: 4px;"><img src="Images/Footer/footerOumaRusksLogo.jpg" 
            alt="Dip 'n Ouma" width="27px" height="27px" style="background-color: #C5C1C0;">
        </div>
    </div>
</body>
</html>
