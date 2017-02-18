<%-- 
    Document   : action5
    Created on : Apr 7, 2016, 2:00:41 PM
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
    </head>
    <body>
        <%
    try{
        String a=request.getParameter("uname");
        String b=request.getParameter("city");
        String c=request.getParameter("rest");
        String d=request.getParameter("food");
        String e=request.getParameter("price");
        
        String query="insert into 3sel values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        stat.executeUpdate(query);
        ResultSet rs=stat.executeQuery("select * from 3sel where uname='"+a+"'");
         if(!rs.last()){
            response.sendRedirect("#");
        }
        
        else{
    %>
    <div id="a">
        <center>
            <table width="1200px">
                <tr>
                    <form action="action6.jsp" method="post">
                    <td width="600px">
                        <p>USERNAME<input type="text" name="uname" value="<%=rs.getString(1)%>"/></p>
                        <p>CITY<input type="text" name="city" value="<%=rs.getString(2)%>"/></p>
                        <p>RESTAURANT<input type="text" value="<%=rs.getString(3)%>" name="rest"/></p>
                        <p>ITEM<input type="text" value="<%=rs.getString(4)%>" name="food"/></p>
                        <p>PRICE<input type="text" value="<%=rs.getString(5)%>" name="price"/></p>
                    </td>
                    <td width="600px">
                        
                        <p>Enter full Name:<input type="text" name="name" value="" placeholder="enter your full name" required="required"/></p>
                        <p>Mobile Number:<input type="text" name="mobile" value="" placeholder="enter 10 digit mobile number" required="required"></p>
                        <p><textarea cols="50" rows="6" name="address" value="" placeholder="enter full address" required="required"></textarea></p>
                        <p>Enter pin code:<input type="text" name="pin" value="" placeholder="enter street code" required="required"/></p>
                        <p><input type="submit" value="ORDER" name="order"></p>
                        </form>
                                  
                    </td>
                </tr>
            </table>
        </center>
    </div>
    
    <%
        }
        con.close();
    }
    catch(SQLException sqle){
        out.println("<p> Error opening JDBC, cause:</p> <b> " + sqle + "</b>");
    }
    catch(ClassNotFoundException cnfe){
      out.println("<p> Error opening JDBC, cause:</p> <b>" + cnfe + "</b>");  
    }
        %>
        
    </body>
</html>
