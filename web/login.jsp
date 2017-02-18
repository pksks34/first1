<%-- 
    Document   : login
    Created on : Apr 2, 2016, 3:28:02 PM
    Author     : PRASHANT KUMAR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="jq.css">
        <script src="min.js"></script>
        <script src="minmob.js"></script>
        <script>
         function validate(){
             var a=document.form1.uname.value;
             if(a==null||a==""){
                 document.getElementById("u1").innerHTML="enter username then login";
                 return false;
             }
             var b=document.form1.pass.value;
             if(b==null||b==""){
                 document.getElementById("p1").innerHTML="enter your password";
                 return false;
             }
             else{
                 return true;
             }
         } 
         </script>
        <style type="text/css">
            body{
                margin:0px;
            }
             #head{
                width:100%;
                height:150px;
                background:black;
            } 
            #n2{
                float:center;
                font-size:70px;
            }
            #n2 a{
                text-decoration:none;
                color:white;
               
            }
            #n2 a:hover{
                text-decoration:none;
                color:white;
            }
            #menu{
                width:100%;
                height:50px;
                background:black;
            }
            #menu a{
                text-align: center;
                color:white;
                text-decoration: none;
               
                width:600px;
                font-size:30px;
               
            }
            #menu a:hover{
                text-decoration: underline;
                color:gold;
            }
             #login{
                max-width:500px;
                padding:20px 12px 10px 20px;
                font:13px Arial;
            }
            #login-heading{
                font-weight:bold;
                font-style:italic;
                border-buttom:2px solid #ddd;
                margin-bottom:20px;
                font-size:35px;
                padding-bottom:3px;
            }
            #login label{
                display:block;
                margin:0px 0px 15px 0px;
            }
            #login label>span{
                width:100px;
                font-weight:bold;
                float:left;
                padding-top:8px;
                padding-right:5px;
            }
            #login span.required{
                color:red;
            }
            #login input.input-field{
                width:48%;
            }
            #login input.input-field{
                box-sizing: border-box;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                border:1px solid #C2C2C2;
                box-shadow:1px 1px 4px #EBEBEB;
                -moz-box-shadow: 1px 1px 4px #4EBEBEB;
                -webkit-box-shadow: 1px 1px 4px #EBEBEB;
                border-radius:3px;
                -webkit-border-radius: 3px;
                -moz-border-radius:3px;
                padding:7px;
                outline:none;
            }
            #login .input-field:focus{
                border:1px solid #0C0;
            }
            #login input[type=submit],
#login input[type=button]{
    border: none;
    padding: 8px 15px 8px 15px;
    background: #FF8500;
    color: #fff;
    box-shadow: 1px 1px 4px #DADADA;
    -moz-box-shadow: 1px 1px 4px #DADADA;
    -webkit-box-shadow: 1px 1px 4px #DADADA;
    border-radius: 3px;
    -webkit-border-radius: 3px;
    -moz-border-radius: 3px;
}
#login input[type=submit]:hover,
#login input[type=button]:hover{
    background: #EA7B00;
    color: #fff;
}
        </style>
    </head>
    <body>
       <header id="head">
        <center>
        <nav id="n2">
            <a href="#">Dinnerkart</a>
            
        </nav>
            <p align="center" style="color:white; font-family: Agency FB; color:white;">A online non-veg food order all over the India.</p>
        </center>
    </header>
   
        <nav id="menu">
            <a href="user.jsp" style="margin-left:90px; padding-left:90px;">HOME</a> 
        <a href="signup.jsp" style="margin-left:400px; padding-left:400px;">SIGN-UP</a>
        </nav>
        <center>
        <div id="login">
            <div id="login-heading">Login</div>
            <form action="action1.jsp" method="post" onSubmit="return validate()" name="form1">
                <label for="field1"><span>USERNAME <span class="required">*</span></span><input type="text" class="input-field" name="uname" value="" placeholder="enter ur username"/><span id="u1" style="color:red;"></span></label>
                <label for="field2"><span>PASSWORD <span class="required">*</span></span><input type="password" class="input-field" name="pass" value="" placeholder="**********"/><span id="p1" style="color:red;"> </span></label>
                <label><span>&nbsp;</span><input type="submit" value="LOGIN"/></label>
            </form>
        </div>
    </center> 
    </body>
</html>
