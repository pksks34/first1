<%-- 
    Document   : action
    Created on : Apr 3, 2016, 2:22:17 PM
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
        String b=request.getParameter("email");
        String c=request.getParameter("fname");
        String d=request.getParameter("lname");
        String e=request.getParameter("pass");
        String f=request.getParameter("repass");
        String query="insert into signup values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        stat.executeUpdate(query);
        response.sendRedirect("login.jsp");
        
    
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
