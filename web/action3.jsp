<%-- 
    Document   : action3
    Created on : Apr 7, 2016, 12:45:55 PM
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
        <script type="text/javascript">
var country_arr = new Array("CHICKEN BRIYANI", "CHICKEN MASALA", "CHICKEN CURRY", "CHICKEN BHUNA","CHICKEN PYAZA","CHICKEN MUGLAI","CHICKEN HANDI","CHICKEN KARAI","CHICKEN TANDOORI","CHICKEN ROAST","CHICKEN BUTTER MASALA","EGG BHURJI","EGG MASALA","EGG CURRY","CURRY","PANEER");
var s_a = new Array();
s_a[0]="";
s_a[1]="90|180|270|360|450|540|630|720|810|900";
s_a[2]="100|200|300|400|500|600|700|800|900|1000";
s_a[3]="110|220|330|440|550|660|770|880|990|1100";
s_a[4]="110|220|330|440|550|660|770|880|990|1100";
s_a[5]="120|240|360|480|600|720|840|960|1080|1200";
s_a[6]="120|240|360|480|600|720|840|960|1080|1200";
s_a[7]="200|400|600|800|1000";
s_a[8]="200|400|600|800|1000";
s_a[9]="100|200|300|400|500|600|700|800|900|1000";
s_a[10]="100|200|300|400|500|600|700|800|900|1000";
s_a[11]="130|260|390|520|650|780|910|1040|1170|1300";
s_a[12]="70|140|210|280|350|420|490|560|630|700";
s_a[13]="80|160|240|320|400|480|560|640|720|800";
s_a[14]="80|160|240|320|400|480|560|640|720|800";
s_a[15]="60|120|180|240|300|360|420|480|540|600";
s_a[16]="120|240|360|480|600|720|840|960|1080|1200";
function populateStates( countryElementId, stateElementId ){
	
	var selectedCountryIndex = document.getElementById( countryElementId ).selectedIndex;

	var stateElement = document.getElementById( stateElementId );
	
	stateElement.length=0;	// Fixed by Julian Woods
	stateElement.options[0] = new Option('Select Price for number of Item','');
	stateElement.selectedIndex = 0;
	
	var state_arr = s_a[selectedCountryIndex].split("|");
	
	for (var i=0; i<state_arr.length; i++) {
		stateElement.options[stateElement.length] = new Option(state_arr[i],state_arr[i]);
	}
}

function populateCountries(countryElementId, stateElementId){
	// given the id of the <select> tag as function argument, it inserts <option> tags
	var countryElement = document.getElementById(countryElementId);
	countryElement.length=0;
	countryElement.options[0] = new Option('Select Food By Above menu','-1');
	countryElement.selectedIndex = 0;
	for (var i=0; i<country_arr.length; i++) {
		countryElement.options[countryElement.length] = new Option(country_arr[i],country_arr[i]);
	}

	// Assigned all countries. Now assign event listener for the states.

	if( stateElementId ){
		countryElement.onchange = function(){
			populateStates( countryElementId, stateElementId );
		};
	}
}
</script>
        <style>
body { margin:0px; }
div#grid_container {
	width:100%;
	height:670px;
}
div#grid_container > div {
	position: absolute;
	width: 25%;
	min-width:250px;
	
}
div#grid_container > div > div {
	margin:0px;
	border: #960 1px solid;
	font-size: 20px;
	background:#FFDC64;
}
</style>
<script>
function renderGrid() {
    var blocks = document.getElementById("grid_container").children;
	var cols = 4, newleft, newtop;
    for(var i = 1; i < blocks.length; i++){
		if (i % cols == 0) {
			newtop = (blocks[i-cols].offsetTop + blocks[i-cols].offsetHeight);
		    blocks[i].style.top = newtop+"px";
		} else {
			if(blocks[i-cols]){
				newleft = (blocks[i-cols].offsetTop + blocks[i-cols].offsetHeight);
				blocks[i].style.top = newleft+"px";
			}
			newleft = (blocks[i-1].offsetLeft + blocks[i-1].offsetWidth);
			blocks[i].style.left = newleft+"px";	
		}
    }
}
window.addEventListener("load", renderGrid, false);
window.addEventListener("resize", renderGrid, false);
</script>
    </head>
    <body>
        <%
    try{
        String a=request.getParameter("uname");
        String b=request.getParameter("city");
        String c=request.getParameter("rest");
        
        
        String query="insert into cities1 values('"+a+"','"+b+"','"+c+"')";
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        stat.executeUpdate(query);
        
         ResultSet rs=stat.executeQuery("select * from cities1 where uname='"+a+"'");
         if(!rs.last()){
            response.sendRedirect("#");
        }
        
        else{
    
    %>
    <form action="action4.jsp" method="post">
        
        
        <div id="grid_container">
    <div><div style="height:235px;"> <p>CHICKEN BRIYANI</p><p align="center">Rs.90</p>
           </div></div>
    <div><div style="height:170px;"> <p>CHICKEN MASALA</p><p align="center">Rs.100</p></div></div>
    <div><div style="height:230px;"> <p>CHICKEN CURRY</p><p align="center">Rs.110</p></div></div>
    <div><div style="height:130px;"> <p>CHICKEN BHUNA</p><p align="center">Rs.110</p></div></div>
    <div><div style="height:150px;"> <p>CHICKEN PYAZA</p><p>Rs.120</p></div></div>
    <div><div style="height:215px;"> <p>CHICKEN MUGLAI</p><p align="center">Rs.120</p></div></div>
    <div><div style="height:135px;"> <p>CHICKEN Handi</p><p align="center">Rs.200</p>
            
        </div></div>
    <div><div style="height:125px;"> <p>CHICKEN Karai</p><p align="center">Rs.200</p></div></div>
    <div><div style="height:160px;"> <p>CHICKEN TANDOORI</p><p>Rs.100</p></div></div>
    <div><div style="height:155px;"> <p>CHICKEN ROAST</p><p>Rs.100</p></div></div>
    <div><div style="height:105px;"> <p>CHICKEN BUTTER MASALA</p><p align="center">Rs.130</p></div></div>
    <div><div style="height:105px;"> <p>EGG BHURJI</p><p align="center">Rs.70</p></div></div>
    <div><div style="height:125px;"> <p>EGG MASALA</p><p align="center">Rs.80</p></div></div>
    <div><div style="height:130px;"> <p>EGG CURRY</p><p align="center">Rs.80</p></div></div>
    <div><div style="height:200px;"><p>CURRY</p><p align="center">Rs.60</p>
	</div></div>
    <div><div style="height:308px;"> <p>PANNEER</p><p align="center">Rs.120</p></div></div>
</div>
        <p>USERNAME<input type="text" name="uname" value="<%=rs.getString(1)%>"/></p>
        <p>CITY<input type="text" name="city" value="<%=rs.getString(2)%>"/></p>
        <p>RESTAURANT<input type="text" value="<%=rs.getString(3)%>" name="rest"/></p>
        <p>Select Food (with price):   <select id="country" name ="country"></select></p>

        <p>Select Price for total item: <select name ="state" id ="state"></select></p>
 <script language="javascript">
populateCountries("country", "state");
 </script>
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
        <form action="#" method="post">
            
            
        </form>
    </body>
</html>

