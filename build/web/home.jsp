<%-- 
    Document   : home
    Created on : Mar 14, 2016, 11:06:03 PM
    Author     : PRASHANT KUMAR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
             if(h!=i|h==null|h==""){
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
          background:black;
          margin: 0px;
      }
        #header{
        height:100px;
        width:100%;
        position:fixed;
        background:darkcyan;
        transition:0.4s;
        }
        #pk{
            float:right;
            font-size: 30px;
        }
        #pk a{
            text-decoration: none;
            color:white;
        }
        #pk a:hover{
            text-decoration:underline;
            color:gold;
        }
        #pks{
            float:left;
            font-size:40px;
            
        }
        #pks a{
            text-decoration: none;
            color:gold;
        }
        #pks a:hover{
            text-decoration:underline;
            color:red;
        }
       
		#b{
		width:100%;
		height:645px;
		background:url(dinner.jpg);
		}
                #c{
                    width:100%;
                    height:645px;
                    background:url('back.jpg');
                }
                .a1{
                    color: white;
                    font-size:50px;
                    margin-top:50px;
                    padding-top:50px;
                   
                }
                #d{
                    width:100%;
                    height:695px;
                    background:red;
                } 
                
                
               
  </style>
    </head>
    <body>
       <div id="f2">
           
            <center>
        <header id="header">
            <nav id="pk">
                <a href="#b" style="padding: 10px 10px 10px 10px;margin: 10px 10px 10px 10px; align:center;">HOME</a>
                <a href="#c" style="padding:10px 10px 10px 10px;margin:10px 10px 10px 10px;">LOGIN</a>
                <a href="#d" style="padding:10px 10px 10px 10px;margin:10px 10px 10px 10px;">REGISTER</a>
            </nav>
            <nav id="pks">
                <p style="color:gold;"><a href="#">DINNERKART</a></p>
            </nav>
        </header>
            </center>
        </div>
		
		<div id="b">
		<center>
		<svg width="400" height="300"
     xmlns="http://www.w3.org/2000/svg" 
     xmlns:xlink="http://www.w3.org/1999/xlink" style="margin-top:170px; padding-top:170px; align:center; margin-left:140px; padding-left:140px;">

  <a xlink:href="user.jsp"
     target="_blank">
    <rect height="30" width="120" y="0" x="0" rx="15"/>
    <text fill="white" text-anchor="middle" 
          y="21" x="60">Welcome</text>
  </a>

</svg>
		</center>
		
		</div>
        <div id="c">
            <center>
                <form action="action1.jsp" method="post" name="form1" onSubmit="return validate()">
                <table>
                    <tr><td class="a1">LOGIN</td></tr> 
                    <tr>
                        <td style="margin-top:100px; padding-top:100px; color:white;">USERNAME:</td>
                        <td style="margin-top:100px; padding-top:100px;"><input type="text" name="uname" id="uname" value="" placeholder="Enter your username"><span id="u1" style="color:red;"></span></td>
                    </tr>
                    <tr>
                        <td style="margin-top:50px; padding-top:50px; color:white;">PASSWORD</td>
                        <td style="margin-top:50px; padding-top:50px;"><input type="password" name="pass" id="pass" value="" placeholder="**********"><span id="p1" style="color:red;"></span></td>
                    </tr>
                    <tr>
                          <td style="margin-top:50px; padding-top: 50px;"><input type="submit" name="LOGIN" value="LOGIN"></td>  
                        </tr>
                    <tr><td style="color:white; margin-top:50px; padding-top:50px;"><a href="#" style="color:white; font-size:30px;">Forgot password?</a></td></tr>
                    
                </table> 
                </form>
            </center>
        </div>
        <div id="d">
            <center>
                <form action="action.jsp" method="post" onSubmit="return validate1()" name="form2">
                    <table>
                        <tr><td class="a1">REGISTER</td></tr>
                        <tr>
                            <td style="margin-top: 100px; padding-top:100px; color:white;">USERNAME</td>
                            <td style="margin-top:100px; padding-top: 100px;"><input type="text" name="uname" value="" placeholder="Create username"><span id="u2" style="color:green;"></span></td>
                            
                        </tr>
                        <tr>
                        <td style="margin-top: 50px; padding-top:50px; color:white;">EMAIL</td>
                        <td style="margin-top:50px; padding-top: 50px;"><input type="email" name="email" value="" placeholder="enter email"><span id="e2" style="color:green;"></span></td>
                     
                            
                        </tr>
                        <tr>
                       <td style="margin-top: 50px; padding-top:50px; color:white;">FIRST NAME</td>
                       <td style="margin-top:50px; padding-top: 50px;"><input type="text" name="fname" value="" placeholder="enter first name"><span id="f2" style="color:green;"></span></td> 
                        </tr>
                        <tr>
                            <td style="margin-top: 50px; padding-top:50px; color:white;">LAST NAME</td>
                            <td style="margin-top:50px; padding-top: 50px;"><input type="text" name="lname" value="" placeholder="enter last name"><span id="l2" style="color:green;"></span></td>
                        </tr>
                        <tr>
                            <td style="margin-top: 50px; padding-top:50px; color:white;">PASSWORD</td>
                            <td style="margin-top:50px; padding-top: 50px;"><input type="password" name="pass" value="" placeholder="**********"><span id="p2" style="color:green;"></span></td>
                        </tr>
                        <tr>
                            <td style="margin-top: 50px; padding-top:50px; color:white;">RE-ENTER PASSWORD</td>
                            <td style="margin-top:50px; padding-top: 50px;"><input type="text" name="repass" value="" placeholder="**********"><span id="rp2" style="color:green;"></span></td>
                        </tr>
                        <tr>
                          <td style="margin-top:50px; padding-top: 50px;"><input type="submit" name="REGISTER" value="REGISTER"></td>  
                        </tr>
                    </table>
                </form>  
            </center>
        </div>
        
    </body>
</html>
