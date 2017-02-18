<%-- 
    Document   : panel
    Created on : Apr 10, 2016, 2:28:08 PM
    Author     : PRASHANT KUMAR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
var country_arr = new Array("Briyani", "Masala", "Handi", "Muglai");
var s_a = new Array();
s_a[0]="40|80|120|160";
s_a[1]="50|100|150|200";
s_a[2]="60|120|180|240";
s_a[3]="70|140|210|280";
s_a[4]="80|160|240|320";
function populateStates( countryElementId, stateElementId ){
	
	var selectedCountryIndex = document.getElementById( countryElementId ).selectedIndex;

	var stateElement = document.getElementById( stateElementId );
	
	stateElement.length=0;	// Fixed by Julian Woods
	stateElement.options[0] = new Option('Select State','');
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
	countryElement.options[0] = new Option('Select Country','-1');
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
    </head>
    <body>
        <form action="panel2.jsp" method="post">
       Select Country (with states):   <select id="country" name ="country"></select>

Select State: <select name ="state" id ="state"></select>
 <script language="javascript">
populateCountries("country", "state");
 </script>
 <input type="submit" value="submit" name="submit"/>
        </form>
    </body>
</html>
