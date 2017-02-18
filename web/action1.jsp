<%-- 
    Document   : action1
    Created on : Apr 6, 2016, 4:00:38 PM
    Author     : PRASHANT KUMAR SINGH
--%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%
    String driver="com.mysql.jdbc.Driver";
    String host="jdbc:mysql://localhost:3306/mini";
    String name="root";
    String pass="prashant";
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            

//This script is used for slide images
//Begin
NewImg = new Array("chicken/butter.jpg", "chicken/hydrabadi.jpg", "chicken/emasala.jpg", "chicken/tandoori.jpg");
var ImgNum = 0;
var ImgLength = NewImg.length - 1;
//Time delay between Slides in milliseconds
var delay = 6000;
var lock = false;
var run;
function chgImg(direction) 
{
if (document.images) 
{
ImgNum = ImgNum + direction;
if (ImgNum > ImgLength)
 {
ImgNum = 0;
}
if (ImgNum < 0) 
{
ImgNum = ImgLength;
}
document.slideshow.src = NewImg[ImgNum];
   }
}
function auto()
 {
if (lock == true) 
{
lock = false;
window.clearInterval(run);
}
else if (lock == false) 
{
lock = true;
run = setInterval("chgImg(1)", delay);
  }
}

        </script>
        <style>
            #sel {
   background: transparent;
   width: 268px;
   padding: 5px;
   font-size: 16px;
   line-height: 1;
   border: 0;
   border-radius: 0;
   height: 34px;
   -webkit-appearance: none;
   }
   body{margin:0 auto; padding:0px; background-color:#580001;}
        </style>
    </head>
    <body onload="javascript:auto()">
        <div id="b">
            <center>
                <img src="chicken/bhuna.jpg" name="slideshow" width="100%" height="350px" />
            </center>
        </div>
        <div id="a">
            <center>
        <%
    try{
        String a=request.getParameter("uname");
        String e=request.getParameter("pass");
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        ResultSet rs=stat.executeQuery("select * from signup where uname='"+a+"' and pass='"+e+"'");
        if(!rs.next()){
            out.println("couldn,t found");
            response.sendRedirect("signup.jsp");
        }
        
        else{
    %>
    <form action="action2.jsp" name="form2" method="post">
        <p><input type="text" name="uname" value="<%=rs.getString(1)%>"</p>
        <h1>Enter your current state</h1>
        <div id="sel">
            <select name="city">
                <option value="">SELECT</option>
                <option value="Patna">PATNA</option>
                <option value="kolkata">KOLKATA</option>
                <option value="Delhi">DELHI</option>
                <option value="Bilaspur">BILASPUR</option>
                <option value="Raipur">RAIPUR</option>
                <option value="Bangalore">BANGALORE</option>
                <option value="Mumbai">MUMBAI</option>
                <option value="Ranchi">RANCHI</option>
                <option value="Hydrabad">HYDRABAD</option>
                <option value="Jammu">JAMMU</option>
                <option value="Vishakhapatnam">VISHAKHAPATNAM</option>
                <option value="Nagpur">NAGPUR</option>
                <option value="Kanpur">KANPUR</option>
                <option value="Indore">INDORE</option>
                <option value="Bhopal">BHOPAL</option>
                <option value="Gurgaon">GURGAON</option>
                <option value="Noida">NOIDA</option>
                <option value="Jaipur">JAIPUR</option>
                <option value="Kota">KOTA</option>
                <option value="Allahabad">ALLAHABAD</option>
                <option value="Lucknow">LUCKNOW</option>
                <option value="Rourkela">ROURKELA</option>
                <option value="Bhuwaneswar">BHUWANESWER</option>
                <option value="Tamil nadu">TAMIL</option>
            </select>
        </div>
        <input type="submit" name="submit" value="SUBMIT"/>
    </form>
        <%
    }
        con.close();}
     catch(SQLException sqle)
    {out.println("<p>Error opening jdbc,cause:</p><b>"+sqle+"</b>");}
    catch(ClassNotFoundException cnfe)
    {out.println("<p>Error opening jdbc,cause:</p><b>"+cnfe+"</b>");}
    
        %>
        </center>
        </div>
    </body>
</html>
