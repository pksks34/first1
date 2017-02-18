<%-- 
    Document   : action6
    Created on : Apr 7, 2016, 2:27:22 PM
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
        function f1(){
            window.location="payment.jsp";
        }
        function f2(){
            window.location="payment1.jsp";
        }
        </script>
    </head>
    <body>
         <%
    try{
        String a=request.getParameter("uname");
        String b=request.getParameter("city");
        String c=request.getParameter("rest");
        String d=request.getParameter("food");
        String e=request.getParameter("price");
         String f=request.getParameter("name");
        String g=request.getParameter("mobile");
        String h=request.getParameter("address");
        String i=request.getParameter("pin");
        
        
        String query="insert into 4sel values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        stat.executeUpdate(query);
        ResultSet rs=stat.executeQuery("select * from 4sel where uname='"+a+"'");
        if(!rs.last()){
            response.sendRedirect("action5.jsp");
        }
        
        else{
    %>
    <div id="a">
        <center>
            <table width="1200px">
                <tr>
                    
                    <td width="600px">
                        <p>USERNAME:<%=rs.getString(1)%></p>
                        <p>CITY:<%=rs.getString(2)%></p>
                        <p>RESTAURANT:<%=rs.getString(3)%></p>
                        <p>ITEM:<%=rs.getString(4)%></p>
                        <p>PRICe:<%=rs.getString(5)%></p>
                    </td>
                    <td width="600px">
                        
                        <p>Name:<%=rs.getString(6)%></p>
                        <p>Mobile Number:<%=rs.getString(7)%></p>
                        <p><%=rs.getString(8)%></p>
                        <p>PIN:<%=rs.getString(9)%></p>
                       
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
        <div id="paid">
            <center>
                <form action="" method="post" name="form3">
                    <h1>Payment Using Debit Card provide faster service</h1>
                    <p>DEBIT CARD:<input type="radio" value="debitcard" onclick="f1()" name="debit"/></p>
                    <p>CASH ON DELIVERY:<input type="radio" value="cod" onclick="f2()" name="cod"/></p>
                </form>
            </center>
        </div>
        
    </body>
</html>
