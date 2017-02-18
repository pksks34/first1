<%-- 
    Document   : payment2
    Created on : Apr 10, 2016, 12:03:22 AM
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
        String a=request.getParameter("cnumber");
        String b=request.getParameter("date");
        String c=request.getParameter("cv");
        String d=request.getParameter("pin");
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        ResultSet rs=stat.executeQuery("select * from pay2 where cnumber='"+a+"'");
        if(!rs.next()){
            System.out.println("not found");
        }
        else{
    %>
     <p>Name of the Account holder:<%=rs.getString(5)%></p>
     <p>Bank Name:<%=rs.getString(6)%></p>
    <p><%=rs.getString(1)%></p>
     <p><%=rs.getString(2)%></p>
      <p><%=rs.getString(3)%></p>
       <p><%=rs.getString(4)%></p>
       
         <%
        }
  
con.close();}
    catch(SQLException sqle){
        out.println("<p> Error opening JDBC, cause:</p> <b> " + sqle + "</b>");
    }
    catch(ClassNotFoundException cnfe){
      out.println("<p> Error opening JDBC, cause:</p> <b>" + cnfe + "</b>");  
    }
%>        
    </body>
</html>
