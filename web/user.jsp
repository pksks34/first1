<%-- 
    Document   : user
    Created on : Mar 28, 2016, 10:02:38 PM
    Author     : PRASHANT KUMAR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            #head{
                width:100%;
                height:150px;
                background:black;
            } 
            #n2{
                float:center;
                font-size:70px;
            }
            #n2 a{
                text-decoration:none;
                color:white;
               
            }
            #n2 a:hover{
                text-decoration:none;
                color:white;
            }
            #menu{
                width:100%;
                height:50px;
                background:black;
            }
            #menu a{
                text-align: center;
                color:white;
                text-decoration: none;
               
                width:600px;
                font-size:30px;
               
            }
            #menu a:hover{
                text-decoration: underline;
                color:gold;
            }
            
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
	font-size: 50px;
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
    <header id="head">
        <center>
        <nav id="n2">
            <a href="#">Dinnerkart</a>
            
        </nav>
            <p align="center" style="color:white; font-family: Agency FB; color:white;">A online non-veg food order all over the India.</p>
        </center>
    </header>
   
        <nav id="menu">
            <a href="login.jsp" style="margin-left:90px; padding-left:90px;">LOGIN</a> 
        <a href="signup.jsp" style="margin-left:400px; padding-left:400px;">SIGN-UP</a>
        </nav>
    
        <div id="grid_container">
            <div><div style="height:235px;"><a href="login.jsp" style="hover:Chicken masala;"><img src="chicken/briyani.jpg" height="235px" width="100%"/></a></div></div>
            <div><div style="height:170px;"><a href="login.jsp"><img src="chicken/masala.jpg" height="170px" width="100%"/></a></div></div>
            <div><div style="height:230px;"><a href="login.jsp"><img src="chicken/curry.jpg" height="230px" width="100%"/></a></div></div>
            <div><div style="height:130px;"><a href="login.jsp"><img src="chicken/hydrabadi.jpg" height="130px" width="100%"/></a></div></div>
            <div><div style="height:150px;"><a href="login.jsp"><img src="chicken/tandoori.jpg" height="150px" width="100%"/></a></div></div>
            <div><div style="height:215px;"><a href="login.jsp"><img src="chicken/roast.jpg" height="215px" width="100%"/></a></div></div>
            <div><div style="height:135px;"><a href="login.jsp"><img src="chicken/mughlai.jpg" height="135px" width="100%"/></a></div></div>
            <div><div style="height:125px;"><a href="login.jsp"><img src="chicken/kadhai.jpg" height="125px" width="100%"/></a></div></div>
            <div><div style="height:160px;"><a href="login.jsp"><img src="chicken/handi.jpg" height="160px" width="100%"/></a></div></div>
            <div><div style="height:155px;"><a href="login.jsp"><img src="chicken/pyaza.png" height="155px" width="100%"/></a></div></div>
    <div><div style="height:105px;"><a href="login.jsp"><img src="chicken/butter.jpg" height="105px" width="100%"/></a></div></div>
    <div><div style="height:105px;"><a href="login.jsp"><img src="chicken/ecurry.jpg" height="115px" width="100%"/></a></div></div>
    <div><div style="height:125px;"><a href="login.jsp"><img src="chicken/emasala.jpg" height="125px" width="100%"/></a></div></div>
    <div><div style="height:130px;"><a href="login.jsp"><img src="chicken/bhurji.jpg" height="130px" width="100%"/></a></div></div>
    <div><div style="height:200px;"><a href="login.jsp"><img src="chicken/leg.jpg" height="200px" width="100%"/></a></div></div>
    <div><div style="height:308px;"><a href="login.jsp"><img src="chicken/bhuna.jpg" height="308px" width="100%"/></a></div></div>
</div>
    </body>
</html>
