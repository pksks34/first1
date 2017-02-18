package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.Driver;

public final class action6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        function f1(){\n");
      out.write("            window.location=\"payment.jsp\";\n");
      out.write("        }\n");
      out.write("        function f2(){\n");
      out.write("            window.location=\"payment1.jsp\";\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

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
    
      out.write("\n");
      out.write("    <div id=\"a\">\n");
      out.write("        <center>\n");
      out.write("            <table width=\"1200px\">\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td width=\"600px\">\n");
      out.write("                        <p>USERNAME:");
      out.print(rs.getString(1));
      out.write("</p>\n");
      out.write("                        <p>CITY:");
      out.print(rs.getString(2));
      out.write("</p>\n");
      out.write("                        <p>RESTAURANT:");
      out.print(rs.getString(3));
      out.write("</p>\n");
      out.write("                        <p>ITEM:");
      out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                        <p>PRICe:");
      out.print(rs.getString(5));
      out.write("</p>\n");
      out.write("                    </td>\n");
      out.write("                    <td width=\"600px\">\n");
      out.write("                        \n");
      out.write("                        <p>Name:");
      out.print(rs.getString(6));
      out.write("</p>\n");
      out.write("                        <p>Mobile Number:");
      out.print(rs.getString(7));
      out.write("</p>\n");
      out.write("                        <p>");
      out.print(rs.getString(8));
      out.write("</p>\n");
      out.write("                        <p>PIN:");
      out.print(rs.getString(9));
      out.write("</p>\n");
      out.write("                       \n");
      out.write("                        </form>\n");
      out.write("                                  \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");

        }
        con.close();
    }
    catch(SQLException sqle){
        out.println("<p> Error opening JDBC, cause:</p> <b> " + sqle + "</b>");
    }
    catch(ClassNotFoundException cnfe){
      out.println("<p> Error opening JDBC, cause:</p> <b>" + cnfe + "</b>");  
    }
        
      out.write("\n");
      out.write("        <div id=\"paid\">\n");
      out.write("            <center>\n");
      out.write("                <form action=\"\" method=\"post\">\n");
      out.write("                    <p>DEBIT CARD:<input type=\"radio\" value=\"debitcard\" onclick=\"f1()\"/></p>\n");
      out.write("                    <p>CASH ON DELIVERY:<input type=\"radio\" value=\"cod\" onclick=\"f2()\"/></p>\n");
      out.write("                </form>\n");
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
