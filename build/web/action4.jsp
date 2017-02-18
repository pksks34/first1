<%-- 
    Document   : action4
    Created on : Apr 7, 2016, 1:50:25 PM
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
        String d=request.getParameter("country");
        String e=request.getParameter("state");
        
        
        String query="insert into logi2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        stat.executeUpdate(query);
        
         ResultSet rs=stat.executeQuery("select * from logi2 where uname='"+a+"'");
        if(!rs.last()){
            response.sendRedirect("#");
        }
        
        else{
    %>
    <form action="action5.jsp" method="post">
        USERNAME<input type="text" name="uname" value="<%=rs.getString(1)%>"/>
        CITY<input type="text" name="city" value="<%=rs.getString(2)%>"/>
        RESTAURANT<input type="text" value="<%=rs.getString(3)%>" name="rest"/>
        ITEM<input type="text" value="<%=rs.getString(4)%>" name="food"/>
        PRICE<input type="text" value="<%=rs.getString(5)%>" name="price"/>
        <p><input type="submit" value="PROCCED to pay" name="procced"/></p>
        
    </form>
    
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
