package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class action1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String driver="com.mysql.jdbc.Driver";
    String host="jdbc:mysql://localhost:3306/mini";
    String name="root";
    String pass="prashant";
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("\n");
      out.write("//This script is used for slide images\n");
      out.write("//Begin\n");
      out.write("NewImg = new Array(\"chicken/butter.jpg\", \"chicken/hydrabadi.jpg\", \"chicken/emasala.jpg\", \"chicken/tandoori.jpg\");\n");
      out.write("var ImgNum = 0;\n");
      out.write("var ImgLength = NewImg.length - 1;\n");
      out.write("//Time delay between Slides in milliseconds\n");
      out.write("var delay = 6000;\n");
      out.write("var lock = false;\n");
      out.write("var run;\n");
      out.write("function chgImg(direction) \n");
      out.write("{\n");
      out.write("if (document.images) \n");
      out.write("{\n");
      out.write("ImgNum = ImgNum + direction;\n");
      out.write("if (ImgNum > ImgLength)\n");
      out.write(" {\n");
      out.write("ImgNum = 0;\n");
      out.write("}\n");
      out.write("if (ImgNum < 0) \n");
      out.write("{\n");
      out.write("ImgNum = ImgLength;\n");
      out.write("}\n");
      out.write("document.slideshow.src = NewImg[ImgNum];\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("function auto()\n");
      out.write(" {\n");
      out.write("if (lock == true) \n");
      out.write("{\n");
      out.write("lock = false;\n");
      out.write("window.clearInterval(run);\n");
      out.write("}\n");
      out.write("else if (lock == false) \n");
      out.write("{\n");
      out.write("lock = true;\n");
      out.write("run = setInterval(\"chgImg(1)\", delay);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            #sel {\n");
      out.write("   background: transparent;\n");
      out.write("   width: 268px;\n");
      out.write("   padding: 5px;\n");
      out.write("   font-size: 16px;\n");
      out.write("   line-height: 1;\n");
      out.write("   border: 0;\n");
      out.write("   border-radius: 0;\n");
      out.write("   height: 34px;\n");
      out.write("   -webkit-appearance: none;\n");
      out.write("   }\n");
      out.write("   body{margin:0 auto; padding:0px; background-color:#580001;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"javascript:auto()\">\n");
      out.write("        <div id=\"b\">\n");
      out.write("            <center>\n");
      out.write("                <img src=\"chicken/bhuna.jpg\" name=\"slideshow\" width=\"1350px\" height=\"250px\" />\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"a\">\n");
      out.write("            <center>\n");
      out.write("        ");

    try{
        String a=request.getParameter("uname");
        String e=request.getParameter("pass");
        Class.forName(driver);
        Connection con=DriverManager.getConnection(host,name,pass);
        Statement stat=con.createStatement();
        ResultSet rs=stat.executeQuery("select * from signup where uname='"+a+"' and pass='"+e+"'");
        if(!rs.next()){
            out.println("couldn,t found");
            response.sendRedirect("signup.jsp");
        }
        
        else{
    
      out.write("\n");
      out.write("    <form action=\"action2.jsp\" name=\"form2\" method=\"post\">\n");
      out.write("        <p><input type=\"text\" name=\"uname\" value=\"");
      out.print(rs.getString(1));
      out.write("\"</p>\n");
      out.write("        <h1>Enter your current state</h1>\n");
      out.write("        <div id=\"sel\">\n");
      out.write("            <select name=\"city\">\n");
      out.write("                <option value=\"\">SELECT</option>\n");
      out.write("                <option value=\"Patna\">PATNA</option>\n");
      out.write("                <option value=\"kolkata\">KOLKATA</option>\n");
      out.write("                <option value=\"Delhi\">DELHI</option>\n");
      out.write("                <option value=\"Bilaspur\">BILASPUR</option>\n");
      out.write("                <option value=\"Raipur\">RAIPUR</option>\n");
      out.write("                <option value=\"Bangalore\">BANGALORE</option>\n");
      out.write("                <option value=\"Mumbai\">MUMBAI</option>\n");
      out.write("                <option value=\"Ranchi\">RANCHI</option>\n");
      out.write("                <option value=\"Hydrabad\">HYDRABAD</option>\n");
      out.write("                <option value=\"Jammu\">JAMMU</option>\n");
      out.write("                <option value=\"Vishakhapatnam\">VISHAKHAPATNAM</option>\n");
      out.write("                <option value=\"Nagpur\">NAGPUR</option>\n");
      out.write("                <option value=\"Kanpur\">KANPUR</option>\n");
      out.write("                <option value=\"Indore\">INDORE</option>\n");
      out.write("                <option value=\"Bhopal\">BHOPAL</option>\n");
      out.write("                <option value=\"Gurgaon\">GURGAON</option>\n");
      out.write("                <option value=\"Noida\">NOIDA</option>\n");
      out.write("                <option value=\"Jaipur\">JAIPUR</option>\n");
      out.write("                <option value=\"Kota\">KOTA</option>\n");
      out.write("                <option value=\"Allahabad\">ALLAHABAD</option>\n");
      out.write("                <option value=\"Lucknow\">LUCKNOW</option>\n");
      out.write("                <option value=\"Rourkela\">ROURKELA</option>\n");
      out.write("                <option value=\"Bhuwaneswar\">BHUWANESWER</option>\n");
      out.write("                <option value=\"Tamil nadu\">TAMIL</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"submit\" name=\"submit\" value=\"SUBMIT\"/>\n");
      out.write("    </form>\n");
      out.write("        ");

    }
        con.close();}
     catch(SQLException sqle)
    {out.println("<p>Error opening jdbc,cause:</p><b>"+sqle+"</b>");}
    catch(ClassNotFoundException cnfe)
    {out.println("<p>Error opening jdbc,cause:</p><b>"+cnfe+"</b>");}
    
        
      out.write("\n");
      out.write("        </center>\n");
      out.write("        </div>\n");
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
