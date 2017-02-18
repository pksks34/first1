<%-- 
    Document   : panel2
    Created on : Apr 10, 2016, 2:34:53 PM
    Author     : PRASHANT KUMAR SINGH
--%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%
    String driver="com.mysql.jdbc.Driver";
    String host="jdbc:mysql://localhost:3306/test";
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
        String a=request.getParameter("state");
        String b=request.getParameter("country");
        
        String query="insert into logi values('"+a+"','"+b+"')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        stat.executeUpdate(query);
       
        
    
    %>
    
    <%
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
