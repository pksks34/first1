package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         function validate1(){\n");
      out.write("             var c=document.form2.uname.value;\n");
      out.write("             if(c==null||c==\"\"||c.length<=8||c.length>=10){\n");
      out.write("                 document.getElementById(\"u2\").innerHTML=\"create username first of length in between 8 and 10\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             var d=document.form2.email.value;\n");
      out.write("             if(d==null||d==\"\"){\n");
      out.write("                 document.getElementById(\"e2\").innerHTML=\"enter email first\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             var e=document.form2.fname.value;\n");
      out.write("             if(e==null||e==\"\"){\n");
      out.write("                 document.getElementById(\"f2\").innerHTML=\"enter first name\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             var f=document.form2.lname.value;\n");
      out.write("             if(f==null||f==\"\"){\n");
      out.write("                 document.getElementById(\"l2\").innerHTML=\"enter last name\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             var g=document.form2.pass.value;\n");
      out.write("             if(g==null||g==\"\"||g.length<=8||g.length>=10){\n");
      out.write("                 document.getElementById(\"p2\").innerHTML=\"enter password of length between 8 and 10\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             var h=document.form2.pass.value;\n");
      out.write("             var i=document.form2.repass.value;\n");
      out.write("             if(h!=i|h==null|h==\"\"){\n");
      out.write("                 document.getElementById(\"rp2\").innerHTML=\"password and re password must be same\";\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             else{\n");
      out.write("                 return true;\n");
      out.write("             }\n");
      out.write("         }\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("  <style type=\"text/css\"> \n");
      out.write("      body{\n");
      out.write("          background:black;\n");
      out.write("          margin: 0px;\n");
      out.write("      }\n");
      out.write("        #header{\n");
      out.write("        height:100px;\n");
      out.write("        width:100%;\n");
      out.write("        position:fixed;\n");
      out.write("        background:darkcyan;\n");
      out.write("        transition:0.4s;\n");
      out.write("        }\n");
      out.write("        #pk{\n");
      out.write("            float:right;\n");
      out.write("            font-size: 30px;\n");
      out.write("        }\n");
      out.write("        #pk a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("        #pk a:hover{\n");
      out.write("            text-decoration:underline;\n");
      out.write("            color:gold;\n");
      out.write("        }\n");
      out.write("        #pks{\n");
      out.write("            float:left;\n");
      out.write("            font-size:40px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        #pks a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:gold;\n");
      out.write("        }\n");
      out.write("        #pks a:hover{\n");
      out.write("            text-decoration:underline;\n");
      out.write("            color:red;\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("\t\t#b{\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\theight:645px;\n");
      out.write("\t\tbackground:url(dinner.jpg);\n");
      out.write("\t\t}\n");
      out.write("                #c{\n");
      out.write("                    width:100%;\n");
      out.write("                    height:645px;\n");
      out.write("                    background:url('back.jpg');\n");
      out.write("                }\n");
      out.write("                .a1{\n");
      out.write("                    color: white;\n");
      out.write("                    font-size:50px;\n");
      out.write("                    margin-top:50px;\n");
      out.write("                    padding-top:50px;\n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("                #d{\n");
      out.write("                    width:100%;\n");
      out.write("                    height:695px;\n");
      out.write("                    background:red;\n");
      out.write("                } \n");
      out.write("                \n");
      out.write("                \n");
      out.write("               \n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"f2\">\n");
      out.write("           \n");
      out.write("            <center>\n");
      out.write("        <header id=\"header\">\n");
      out.write("            <nav id=\"pk\">\n");
      out.write("                <a href=\"#b\" style=\"padding: 10px 10px 10px 10px;margin: 10px 10px 10px 10px; align:center;\">HOME</a>\n");
      out.write("                <a href=\"#c\" style=\"padding:10px 10px 10px 10px;margin:10px 10px 10px 10px;\">LOGIN</a>\n");
      out.write("                <a href=\"#d\" style=\"padding:10px 10px 10px 10px;margin:10px 10px 10px 10px;\">REGISTER</a>\n");
      out.write("            </nav>\n");
      out.write("            <nav id=\"pks\">\n");
      out.write("                <p style=\"color:gold;\"><a href=\"#\">DINNERKART</a></p>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"b\">\n");
      out.write("\t\t<center>\n");
      out.write("\t\t<svg width=\"400\" height=\"300\"\n");
      out.write("     xmlns=\"http://www.w3.org/2000/svg\" \n");
      out.write("     xmlns:xlink=\"http://www.w3.org/1999/xlink\" style=\"margin-top:170px; padding-top:170px; align:center; margin-left:140px; padding-left:140px;\">\n");
      out.write("\n");
      out.write("  <a xlink:href=\"user.jsp\"\n");
      out.write("     target=\"_blank\">\n");
      out.write("    <rect height=\"30\" width=\"120\" y=\"0\" x=\"0\" rx=\"15\"/>\n");
      out.write("    <text fill=\"white\" text-anchor=\"middle\" \n");
      out.write("          y=\"21\" x=\"60\">Welcome</text>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("</svg>\n");
      out.write("\t\t</center>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("        <div id=\"c\">\n");
      out.write("            <center>\n");
      out.write("                <form action=\"action1.jsp\" method=\"post\" name=\"form1\" onSubmit=\"return validate()\">\n");
      out.write("                <table>\n");
      out.write("                    <tr><td class=\"a1\">LOGIN</td></tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"margin-top:100px; padding-top:100px; color:white;\">USERNAME:</td>\n");
      out.write("                        <td style=\"margin-top:100px; padding-top:100px;\"><input type=\"text\" name=\"uname\" id=\"uname\" value=\"\" placeholder=\"Enter your username\"><span id=\"u1\" style=\"color:red;\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"margin-top:50px; padding-top:50px; color:white;\">PASSWORD</td>\n");
      out.write("                        <td style=\"margin-top:50px; padding-top:50px;\"><input type=\"password\" name=\"pass\" id=\"pass\" value=\"\" placeholder=\"**********\"><span id=\"p1\" style=\"color:red;\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                          <td style=\"margin-top:50px; padding-top: 50px;\"><input type=\"submit\" name=\"LOGIN\" value=\"LOGIN\"></td>  \n");
      out.write("                        </tr>\n");
      out.write("                    <tr><td style=\"color:white; margin-top:50px; padding-top:50px;\"><a href=\"#\" style=\"color:white; font-size:30px;\">Forgot password?</a></td></tr>\n");
      out.write("                    \n");
      out.write("                </table> \n");
      out.write("                </form>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"d\">\n");
      out.write("            <center>\n");
      out.write("                <form action=\"action.jsp\" method=\"post\" onSubmit=\"return validate1()\" name=\"form2\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr><td class=\"a1\">REGISTER</td></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"margin-top: 100px; padding-top:100px; color:white;\">USERNAME</td>\n");
      out.write("                            <td style=\"margin-top:100px; padding-top: 100px;\"><input type=\"text\" name=\"uname\" value=\"\" placeholder=\"Create username\"><span id=\"u2\" style=\"color:green;\"></span></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td style=\"margin-top: 50px; padding-top:50px; color:white;\">EMAIL</td>\n");
      out.write("                        <td style=\"margin-top:50px; padding-top: 50px;\"><input type=\"email\" name=\"email\" value=\"\" placeholder=\"enter email\"><span id=\"e2\" style=\"color:green;\"></span></td>\n");
      out.write("                     \n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                       <td style=\"margin-top: 50px; padding-top:50px; color:white;\">FIRST NAME</td>\n");
      out.write("                       <td style=\"margin-top:50px; padding-top: 50px;\"><input type=\"text\" name=\"fname\" value=\"\" placeholder=\"enter first name\"><span id=\"f2\" style=\"color:green;\"></span></td> \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"margin-top: 50px; padding-top:50px; color:white;\">LAST NAME</td>\n");
      out.write("                            <td style=\"margin-top:50px; padding-top: 50px;\"><input type=\"text\" name=\"lname\" value=\"\" placeholder=\"enter last name\"><span id=\"l2\" style=\"color:green;\"></span></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"margin-top: 50px; padding-top:50px; color:white;\">PASSWORD</td>\n");
      out.write("                            <td style=\"margin-top:50px; padding-top: 50px;\"><input type=\"password\" name=\"pass\" value=\"\" placeholder=\"**********\"><span id=\"p2\" style=\"color:green;\"></span></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"margin-top: 50px; padding-top:50px; color:white;\">RE-ENTER PASSWORD</td>\n");
      out.write("                            <td style=\"margin-top:50px; padding-top: 50px;\"><input type=\"text\" name=\"repass\" value=\"\" placeholder=\"**********\"><span id=\"rp2\" style=\"color:green;\"></span></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td style=\"margin-top:50px; padding-top: 50px;\"><input type=\"submit\" name=\"REGISTER\" value=\"REGISTER\"></td>  \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>  \n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
