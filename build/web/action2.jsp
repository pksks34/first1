<%-- 
    Document   : action2
    Created on : Apr 6, 2016, 5:27:27 PM
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
        
        String query="insert into cities values('"+a+"','"+b+"')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        stat.executeUpdate(query);
        
        ResultSet rs=stat.executeQuery("select * from cities where uname='"+a+"'");
         if(!rs.last()){
            response.sendRedirect("#");
        }
        
        else{
       
    
    %>
    <form action="action3.jsp" method="post">
        USERNAME<input type="text" name="uname" value="<%=rs.getString(1)%>"/>
        CITY<input type="text" name="city" value="<%=rs.getString(2)%>"/>
        <p>Select Restaurant:</p>
        <p><input type="radio" name="rest" value="murg">MURG MASALAM</p>
        <p><input type="radio" name="rest" value="dbc">DELHI BRIYANI</p>
        <p><input type="radio" name="rest" value="madrasi">MADRASI</p>
        <p><input type="radio" name="rest" value="jaika">JAIKA</p>
        <p><input type="radio" name="rest" value="china">CHINA BOLL</p>
        <p><input type="submit" value="PROCCED" name="procced"/></p>
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
        <form action="#" method="post">
            
            
        </form>
    </body>
</html>
