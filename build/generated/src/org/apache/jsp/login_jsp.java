package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"jq.css\">\n");
      out.write("        <script src=\"min.js\"></script>\n");
      out.write("        <script src=\"minmob.js\"></script>\n");
      out.write("        <script>\n");
      out.write("         function validate(){\n");
      out.write("             var a=document.form1.uname.value;\n");
      out.write("             if(a==null||a==\"\"){\n");
      out.write("                 document.getElementById(\"u1\").innerHTML=\"enter username then login\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             var b=document.form1.pass.value;\n");
      out.write("             if(b==null||b==\"\"){\n");
      out.write("                 document.getElementById(\"p1\").innerHTML=\"enter your password\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             else{\n");
      out.write("                 return true;\n");
      out.write("             }\n");
      out.write("         } \n");
      out.write("         </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                margin:0px;\n");
      out.write("            }\n");
      out.write("             #head{\n");
      out.write("                width:100%;\n");
      out.write("                height:150px;\n");
      out.write("                background:black;\n");
      out.write("            } \n");
      out.write("            #n2{\n");
      out.write("                float:center;\n");
      out.write("                font-size:70px;\n");
      out.write("            }\n");
      out.write("            #n2 a{\n");
      out.write("                text-decoration:none;\n");
      out.write("                color:white;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            #n2 a:hover{\n");
      out.write("                text-decoration:none;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            #menu{\n");
      out.write("                width:100%;\n");
      out.write("                height:50px;\n");
      out.write("                background:black;\n");
      out.write("            }\n");
      out.write("            #menu a{\n");
      out.write("                text-align: center;\n");
      out.write("                color:white;\n");
      out.write("                text-decoration: none;\n");
      out.write("               \n");
      out.write("                width:600px;\n");
      out.write("                font-size:30px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            #menu a:hover{\n");
      out.write("                text-decoration: underline;\n");
      out.write("                color:gold;\n");
      out.write("            }\n");
      out.write("             #login{\n");
      out.write("                max-width:500px;\n");
      out.write("                padding:20px 12px 10px 20px;\n");
      out.write("                font:13px Arial;\n");
      out.write("            }\n");
      out.write("            #login-heading{\n");
      out.write("                font-weight:bold;\n");
      out.write("                font-style:italic;\n");
      out.write("                border-buttom:2px solid #ddd;\n");
      out.write("                margin-bottom:20px;\n");
      out.write("                font-size:35px;\n");
      out.write("                padding-bottom:3px;\n");
      out.write("            }\n");
      out.write("            #login label{\n");
      out.write("                display:block;\n");
      out.write("                margin:0px 0px 15px 0px;\n");
      out.write("            }\n");
      out.write("            #login label>span{\n");
      out.write("                width:100px;\n");
      out.write("                font-weight:bold;\n");
      out.write("                float:left;\n");
      out.write("                padding-top:8px;\n");
      out.write("                padding-right:5px;\n");
      out.write("            }\n");
      out.write("            #login span.required{\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("            #login input.input-field{\n");
      out.write("                width:48%;\n");
      out.write("            }\n");
      out.write("            #login input.input-field{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                border:1px solid #C2C2C2;\n");
      out.write("                box-shadow:1px 1px 4px #EBEBEB;\n");
      out.write("                -moz-box-shadow: 1px 1px 4px #4EBEBEB;\n");
      out.write("                -webkit-box-shadow: 1px 1px 4px #EBEBEB;\n");
      out.write("                border-radius:3px;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                -moz-border-radius:3px;\n");
      out.write("                padding:7px;\n");
      out.write("                outline:none;\n");
      out.write("            }\n");
      out.write("            #login .input-field:focus{\n");
      out.write("                border:1px solid #0C0;\n");
      out.write("            }\n");
      out.write("            #login input[type=submit],\n");
      out.write("#login input[type=button]{\n");
      out.write("    border: none;\n");
      out.write("    padding: 8px 15px 8px 15px;\n");
      out.write("    background: #FF8500;\n");
      out.write("    color: #fff;\n");
      out.write("    box-shadow: 1px 1px 4px #DADADA;\n");
      out.write("    -moz-box-shadow: 1px 1px 4px #DADADA;\n");
      out.write("    -webkit-box-shadow: 1px 1px 4px #DADADA;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    -webkit-border-radius: 3px;\n");
      out.write("    -moz-border-radius: 3px;\n");
      out.write("}\n");
      out.write("#login input[type=submit]:hover,\n");
      out.write("#login input[type=button]:hover{\n");
      out.write("    background: #EA7B00;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <header id=\"head\">\n");
      out.write("        <center>\n");
      out.write("        <nav id=\"n2\">\n");
      out.write("            <a href=\"#\">Dinnerkart</a>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("            <p align=\"center\" style=\"color:white; font-family: Agency FB; color:white;\">A online non-veg food order all over the India.</p>\n");
      out.write("        </center>\n");
      out.write("    </header>\n");
      out.write("   \n");
      out.write("        <nav id=\"menu\">\n");
      out.write("            <a href=\"user.jsp\" style=\"margin-left:90px; padding-left:90px;\">HOME</a> \n");
      out.write("        <a href=\"signup.jsp\" style=\"margin-left:400px; padding-left:400px;\">SIGN-UP</a>\n");
      out.write("        </nav>\n");
      out.write("        <center>\n");
      out.write("        <div id=\"login\">\n");
      out.write("            <div id=\"login-heading\">Login</div>\n");
      out.write("            <form action=\"action1.jsp\" method=\"post\" onSubmit=\"return validate()\" name=\"form1\">\n");
      out.write("                <label for=\"field1\"><span>USERNAME <span class=\"required\">*</span></span><input type=\"text\" class=\"input-field\" name=\"uname\" value=\"\" placeholder=\"enter ur username\"/><span id=\"u1\" style=\"color:red;\"></span></label>\n");
      out.write("                <label for=\"field2\"><span>PASSWORD <span class=\"required\">*</span></span><input type=\"password\" class=\"input-field\" name=\"pass\" value=\"\" placeholder=\"**********\"/><span id=\"p1\" style=\"color:red;\"> </span></label>\n");
      out.write("                <label><span>&nbsp;</span><input type=\"submit\" value=\"LOGIN\"/></label>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </center> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
