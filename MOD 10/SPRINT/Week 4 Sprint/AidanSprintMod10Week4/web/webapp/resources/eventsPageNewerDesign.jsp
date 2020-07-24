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

<div id="eventContainer">
<div id="eventBar">
<div style="display: flex; flex-wrap: nowrap;"><!--flex-flow: column-->
    <div id="eventDivisions">
        <div>Division: </div>
        <div><button íd="primaryDivision" onclick="showPrimary(); currentDivisionPrimary()" style="background-color: rgb(143, 134, 4);"><a href="eventsPagePrimaryAcademicsFrame.jsp" target="eventsFrame" style="width: 91px; color: white;">Primary School</a></button></div>  
        <div><button íd="highDivision" onload="loadHighDivision()" onclick="showHigh(); currentDivisionHigh()" style="background-color: rgb(143, 134, 4);"><a href="eventsPageHighAcademics.jsp" target="eventsFrame" style="color: white;">High School</a></button></div>
        </div>     
    </div>
    <div id="eventList">
    <div id="primaryEvents"><!-- -->
    <div><a href="eventsPagePrimaryAcademicsFrame.jsp" target="eventsFrame">
        <button class="eventChoice" style="border-radius: 5px; background-color: red; color: white; border-color: darkred;">Academics</button></a></div>
        <div><a href="eventsPagePrimarySportFrame.jsp" target="eventsFrame"><button class="eventChoice" style="border-radius: 5px; background-color: blue; color: white; border-color: darkblue;">Sport</button></a></div>
        <div><a href="eventsPagePrimaryCultureFrame.jsp" target="eventsFrame"><button class="eventChoice" style="border-radius: 5px; background-color: rebeccapurple; color: white; border-color: purple;">Culture</button></a></div>
        <div><a href="eventsPagePrimaryOtherFrame.jsp" target="eventsFrame"><button class="eventChoice" style="border-radius: 5px; background-color: green; color: white; border-color: darkgreen;">Other</button></a></div>
    </div>
    <div id="highEvents">
        <div><a href="eventsPageHighAcademics.jsp" target="eventsFrame"><button class="eventChoice" style="border-radius: 5px; background-color: red; color: white; border-color: darkred;">Academics</button></a></div>
        <div><a href="eventsPageHighSport.jsp" target="eventsFrame"><button class="eventChoice" style="border-radius: 5px; background-color: blue; color: white; border-color: darkblue;">Sport</button></a></div>
        <div><a href="eventsPageHighCulture.jsp" target="eventsFrame"><button class="eventChoice" style="border-radius: 5px; background-color: rebeccapurple; color: white; border-color: purple;">Culture</button></a></div>
        <div><a href="eventsPageHighOther.jsp" target="eventsFrame"><button class="eventChoice" style="border-radius: 5px; background-color: green; color: white; border-color: darkgreen;">Other</button></a></div>
    </div>
</div>
</div>
<iframe id="eventFrame" src="eventsPageHighAcademics.jsp" name="eventsFrame" style="background-color: #c2bdb0"></iframe>
</div>
<!--An inline frame is used to embed another html document(namely aboutUsFrame.html) within the current HTML document. 
    The 'src' attribute is used to specify the URL of the document that occupies the iframe. 
    The ''-id is used to set the height and width to specify the size of the iframe-->
    <div class="links">
        <div style="padding-top: 4px;"><a class="socialShower">Social Media Links</a></div><!--Social Media links to various social media networking platforms-->
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

        <script>
            function showPrimary(){
                document.getElementById('primaryEvents').style.display='flex';
                document.getElementById('highEvents').style.display='none';
                document.getElementById('highDivision').style.backgroundColor = 'grey';
                }
            function showHigh(){
                document.getElementById('primaryEvents').style.display='none';
                document.getElementById('highEvents').style.display='flex';
                }
            function currentDivisionPrimary() {
                if(document.getElementById('primaryDivision').style.backgroundColor == 'grey'){document.getElementById('primaryDivision').style.backgroundColor = 'rgb(143, 134, 4)'; document.getElementById('highDivision').style.backgroundColor = 'grey'}
            }
            function currentDivisionHigh() {
                if(document.getElementById('highDivision').style.backgroundColor == 'grey'){document.getElementById('highDivision').style.backgroundColor = 'rgb(143, 134, 4)'; document.getElementById('primaryDivision').style.backgroundColor = 'grey'}
            }
            function loadHighDivision(){
                document.getElementById('primaryDivision').style.backgroundColor = 'grey';
                document.getElementById('highDivision').style.backgroundColor = 'rgb(143, 134, 4)';
            }
        </script>

    </body>
    </html>