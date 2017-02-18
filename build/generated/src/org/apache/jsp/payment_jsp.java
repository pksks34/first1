package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        function f2(){\n");
      out.write("          var x=document.form.cnumber.value;\n");
      out.write("          if(x==\"\"||isNaN(x)||x.length!=16){\n");
      out.write("            return false;  \n");
      out.write("          }\n");
      out.write("          else{\n");
      out.write("              return true;\n");
      out.write("          }\n");
      out.write("          var y=document.form.cv.value;\n");
      out.write("          if(y==\"\"||isNaN(y)||y.length!=3){\n");
      out.write("            return false;  \n");
      out.write("          }\n");
      out.write("          else{\n");
      out.write("              return true;\n");
      out.write("          }\n");
      out.write("           var u=document.form.pin.value;\n");
      out.write("          if(u==\"\"||isNaN(u)||u.length!=4){\n");
      out.write("            return false;  \n");
      out.write("          }\n");
      out.write("          else{\n");
      out.write("              return true;\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"payment2.jsp\" method=\"post\" onsubmit=\"return f2()\">\n");
      out.write("            <p align=\"center\">Card-Number:<input type=\"text\" name=\"cnumber\" value=\"\" placeholder=\"enter 16 digit card number\"/></p>\n");
      out.write("            <p align=\"center\">Expiry Date:<input type=\"date\" name=\"date\" value=\"\" required=\"required\"/></p>\n");
      out.write("            <p align=\"center\">CVV Code:<input type=\"text\" name=\"cv\" value=\"\" placeholder=\"CVV\"/></p>\n");
      out.write("            <p align=\"center\">PIN:<input type=\"text\" name=\"pin\" value=\"\" placeholder=\"Enter PIN\" required=\"required\"/></p>\n");
      out.write("            <p align=\"center\"><input type=\"submit\" name=\"submit\" value=\"submit\"/></p>\n");
      out.write("        </form>\n");
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
