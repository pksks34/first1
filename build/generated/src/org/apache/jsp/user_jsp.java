package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style type=\"text/css\">\n");
      out.write("            #head{\n");
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
      out.write("            \n");
      out.write("            body { margin:0px; }\n");
      out.write("div#grid_container {\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:670px;\n");
      out.write("}\n");
      out.write("div#grid_container > div {\n");
      out.write("\tposition: absolute;\n");
      out.write("\twidth: 25%;\n");
      out.write("\tmin-width:250px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("div#grid_container > div > div {\n");
      out.write("\tmargin:0px;\n");
      out.write("\tborder: #960 1px solid;\n");
      out.write("\tfont-size: 50px;\n");
      out.write("\tbackground:#FFDC64;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("function renderGrid() {\n");
      out.write("    var blocks = document.getElementById(\"grid_container\").children;\n");
      out.write("\tvar cols = 4, newleft, newtop;\n");
      out.write("    for(var i = 1; i < blocks.length; i++){\n");
      out.write("\t\tif (i % cols == 0) {\n");
      out.write("\t\t\tnewtop = (blocks[i-cols].offsetTop + blocks[i-cols].offsetHeight);\n");
      out.write("\t\t    blocks[i].style.top = newtop+\"px\";\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tif(blocks[i-cols]){\n");
      out.write("\t\t\t\tnewleft = (blocks[i-cols].offsetTop + blocks[i-cols].offsetHeight);\n");
      out.write("\t\t\t\tblocks[i].style.top = newleft+\"px\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tnewleft = (blocks[i-1].offsetLeft + blocks[i-1].offsetWidth);\n");
      out.write("\t\t\tblocks[i].style.left = newleft+\"px\";\t\n");
      out.write("\t\t}\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("window.addEventListener(\"load\", renderGrid, false);\n");
      out.write("window.addEventListener(\"resize\", renderGrid, false);\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <header id=\"head\">\n");
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
      out.write("            <a href=\"login.jsp\" style=\"margin-left:90px; padding-left:90px;\">LOGIN</a> \n");
      out.write("        <a href=\"signup.jsp\" style=\"margin-left:400px; padding-left:400px;\">SIGN-UP</a>\n");
      out.write("        </nav>\n");
      out.write("    \n");
      out.write("        <div id=\"grid_container\">\n");
      out.write("            <div><div style=\"height:235px;\"><a href=\"login.jsp\" style=\"hover:Chicken masala;\"><img src=\"chicken/briyani.jpg\" height=\"235px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:170px;\"><a href=\"login.jsp\"><img src=\"chicken/masala.jpg\" height=\"170px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:230px;\"><a href=\"login.jsp\"><img src=\"chicken/curry.jpg\" height=\"230px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:130px;\"><a href=\"login.jsp\"><img src=\"chicken/hydrabadi.jpg\" height=\"130px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:150px;\"><a href=\"login.jsp\"><img src=\"chicken/tandoori.jpg\" height=\"150px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:215px;\"><a href=\"login.jsp\"><img src=\"chicken/roast.jpg\" height=\"215px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:135px;\"><a href=\"login.jsp\"><img src=\"chicken/mughlai.jpg\" height=\"135px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:125px;\"><a href=\"login.jsp\"><img src=\"chicken/kadhai.jpg\" height=\"125px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:160px;\"><a href=\"login.jsp\"><img src=\"chicken/handi.jpg\" height=\"160px\" width=\"100%\"/></a></div></div>\n");
      out.write("            <div><div style=\"height:155px;\"><a href=\"login.jsp\"><img src=\"chicken/pyaza.png\" height=\"155px\" width=\"100%\"/></a></div></div>\n");
      out.write("    <div><div style=\"height:105px;\"><a href=\"login.jsp\"><img src=\"chicken/butter.jpg\" height=\"105px\" width=\"100%\"/></a></div></div>\n");
      out.write("    <div><div style=\"height:105px;\"><a href=\"login.jsp\"><img src=\"chicken/ecurry.jpg\" height=\"115px\" width=\"100%\"/></a></div></div>\n");
      out.write("    <div><div style=\"height:125px;\"><a href=\"login.jsp\"><img src=\"chicken/emasala.jpg\" height=\"125px\" width=\"100%\"/></a></div></div>\n");
      out.write("    <div><div style=\"height:130px;\"><a href=\"login.jsp\"><img src=\"chicken/bhurji.jpg\" height=\"130px\" width=\"100%\"/></a></div></div>\n");
      out.write("    <div><div style=\"height:200px;\"><a href=\"login.jsp\"><img src=\"chicken/leg.jpg\" height=\"200px\" width=\"100%\"/></a></div></div>\n");
      out.write("    <div><div style=\"height:308px;\"><a href=\"login.jsp\"><img src=\"chicken/bhuna.jpg\" height=\"308px\" width=\"100%\"/></a></div></div>\n");
      out.write("</div>\n");
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
