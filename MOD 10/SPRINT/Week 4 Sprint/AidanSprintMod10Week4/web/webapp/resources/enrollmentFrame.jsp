<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
                background-color: black;
            }

            * {
                box-sizing: border-box;
            }

            /* Add padding to containers */
            .container {
                padding: 16px;
                background-color:whitesmoke;
                    /*white;*/
            }

            /* Full-width input fields */
            input[type=text], input[type=password] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: 1px solid black;
                background: #f1f1f1;
            }

            input[type=text]:focus, input[type=password]:focus {
                background-color: #ddd;
                outline: none;
            }

            /* Overwrite default styles of hr */
            hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }

            /* Set a style for the submit button */
            .registerbtn {
                background-color:darkgreen;
                    /*#4CAF50;*/
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            .registerbtn:hover {
                opacity: 1;
            }

            /* Add a blue text color to links */
            a {
                color: dodgerblue;
            }

            /* Set a grey background color and center the text of the "sign in" section */
            .signin {
                background-color: #f1f1f1;
                text-align: center;
            }
        </style>
    </head>
    <body>

        <form action="/action_page.php">
            <div class="container">
                <h1>Register</h1>
                <p>Please fill in this form to create an account.</p>
                <hr>

                <label for="fcit"><b>Parent/Guardian Citizenship:</b></label>
                <input type="text" placeholder="South African" name="fcit" id="fcit" required>

                <label for="fdoc"><b>Parent/Guardian Document:</b></label>
                <input type="text" placeholder="" name="fdoc" id="fdoc">

                <label for="fstat"><b>Status:</b></label>
                <input type="text" placeholder="Single" name="fstat" id="fstat">

                <label for="fname"><b>First name:</b></label>
                <input type="text" placeholder="Name" name="fname" id="fname" required>

                <label for="fsurname"><b>Surname:</b></label>
                <input type="text" placeholder="Surname" name="sname" id="sname" required><br>

                <label for="gender"><b>Gender</b></label><br>
                <input type="radio" id="male" name="gender" value="male" required>
                <label for="male">Male</label><br>



                <input type="radio" id="female" name="gender" value="female">
                <label for="female">Female</label><br><br>

                <label for="phone"><b>Contact Number:</b></label><br><br>
                <input type="tel" id="phone" name="phone" placeholder="123-45-678" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}" required><br><br>

                <label for="email"><b>Email:</b></label>
                <input type="text" placeholder="Enter Email" name="email" id="email" required>

                <label for="psw"><b>Password:</b></label>
                <input type="password" placeholder="Password" name="psw" id="psw" required>

                <label for="psw-repeat"><b>Confirm Password:</b></label>
                <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>

                <label for="upfile">Select file for upload:</label>
                <input type="file" id="upfile" name="upfile"><br><br>

                <hr>   

                <button type="submit" class="registerbtn">Register</button>
            </div>

            <div class="container signin">
                <p>Already have an account? <a href="../../runLog">Sign in</a>.</p>
            </div>
        </form>

    </body>
</html>
