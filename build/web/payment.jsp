<%-- 
    Document   : payment
    Created on : Apr 9, 2016, 8:05:21 PM
    Author     : PRASHANT KUMAR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
        function f2(){
          var x=document.form.cnumber.value;
          if(x==""||isNaN(x)||x.length!=16){
            return false;  
          }
          else{
              return true;
          }
          var y=document.form.cv.value;
          if(y==""||isNaN(y)||y.length!=3){
            return false;  
          }
          else{
              return true;
          }
           var u=document.form.pin.value;
          if(u==""||isNaN(u)||u.length!=4){
            return false;  
          }
          else{
              return true;
          }
        }
        </script>
    </head>
    <body>
        <form action="payment2.jsp" method="post" onsubmit="return f2()">
            <p align="center">Card-Number:<input type="text" name="cnumber" value="" placeholder="enter 16 digit card number"/></p>
            <p align="center">Expiry Date:<input type="date" name="date" value="" required="required"/></p>
            <p align="center">CVV Code:<input type="text" name="cv" value="" placeholder="CVV"/></p>
            <p align="center">PIN:<input type="text" name="pin" value="" placeholder="Enter PIN" required="required"/></p>
            <p align="center"><input type="submit" name="submit" value="submit"/></p>
        </form>
    </body>
</html>
