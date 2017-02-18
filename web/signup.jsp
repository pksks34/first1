<%-- 
    Document   : signup
    Created on : Apr 2, 2016, 9:39:48 PM
    Author     : PRASHANT KUMAR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
        function validate1(){
             var c=document.form2.uname.value;
             if(c==null||c==""||c.length<=8||c.length>=10){
                 document.getElementById("u2").innerHTML="create username first of length in between 8 and 10";
                 return false;
             }
             var d=document.form2.email.value;
             if(d==null||d==""){
                 document.getElementById("e2").innerHTML="enter email first";
                 return false;
             }
             var e=document.form2.fname.value;
             if(e==null||e==""){
                 document.getElementById("f2").innerHTML="enter first name";
                 return false;
             }
             var f=document.form2.lname.value;
             if(f==null||f==""){
                 document.getElementById("l2").innerHTML="enter last name";
                 return false;
             }
             var g=document.form2.pass.value;
             if(g==null||g==""||g.length<=8||g.length>=10){
                 document.getElementById("p2").innerHTML="enter password of length between 8 and 10";
                 return false;
             }
             var h=document.form2.pass.value;
             var i=document.form2.repass.value;
             if(h!=i||h==null||h==""){
                 document.getElementById("rp2").innerHTML="password and re password must be same";
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
            #signup{
                max-width:500px;
                padding:20px 12px 10px 20px;
                font:13px Arial;
            }
            #signup-heading{
                font-weight:bold;
                font-style:italic;
                border-buttom:2px solid #ddd;
                margin-bottom:20px;
                font-size:45px;
                padding-bottom:3px;
            }
            #signup label{
                display:block;
                margin:0px 0px 15px 0px;
            }
            #signup label>span{
                width:100px;
                font-weight:bold;
                float:left;
                padding-top:8px;
                padding-right:5px;
            }
            #signup span.required{
                color:red;
            }
            #signup input.input-field{
                width:48%;
            }
            #signup input.input-field{
                box-sizing: border-box;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                border:4px solid #C2C2C2;
                box-shadow:1px 1px 4px #EBEBEB;
                -moz-box-shadow: 1px 1px 4px #4EBEBEB;
                -webkit-box-shadow: 1px 1px 4px #EBEBEB;
                border-radius:3px;
                -webkit-border-radius: 3px;
                -moz-border-radius:3px;
                padding:7px;
                outline:none;
            }
            #signup .input-field:focus{
                border:1px solid #0C0;
            }
            #signup input[type=submit],
#signup input[type=button]{
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
#signup input[type=submit]:hover,
#signup input[type=button]:hover{
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
        <a href="login.jsp" style="margin-left:400px; padding-left:400px;">LOGIN</a>
        </nav>
    <center>
        <div id="signup">
            <div id="signup-heading">SIGN-UP</div>
            <form action="action.jsp" method="post" onsubmit="return validate1()" name="form2">
                <label for="field1"><span>USERNAME <span class="required">*</span></span><input type="text" name="uname" value="" placeholder="create username"/></label><span id="u2" style="color:red;"></span>
                <label for="field2"><span>EMAIL <span class="required">*</span></span><input type="email" name="email" value="" placeholder="enter email"/><span id="e2" style="color:red"></span></label>
                <label for="field3"><span>FIRST NAME <span class="required">*</span></span><input type="text" name="fname" value="" placeholder="enter first name"><span id="f2" style="color:red;"></span></label>
                <label for="field4"><span>LAST NAME <span class="required">*</span></span><input type="text" name="lname" value="" placeholder="enter last name"/><span id="l2" style="color:red;"></span></label>
                <label for="field5"><span>PASSWORD <span class="required">*</span></span><input type="password" name="pass" value="" placeholder="**********"/><span id="p2" style="color:red;"></span></label>
                <label for="field6"><span>RE-PASSWORD<span class="required">*</span></span><input type="password" name="repass" value="" placeholder="**********"/><span id="rp2" style="color:red;"></span></label>
                <label><span>&nbsp;</span><input type="submit" value="SIGN-UP"/></label>
            </form>
        </div>
    </center>
    </body>
</html>
