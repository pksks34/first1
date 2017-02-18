package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class panel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("var country_arr = new Array(\"Briyani\", \"Masala\", \"Handi\", \"Muglai\");\n");
      out.write("var s_a = new Array();\n");
      out.write("s_a[0]=\"40|80|120|160\";\n");
      out.write("s_a[1]=\"50|100|150|200\";\n");
      out.write("s_a[2]=\"60|120|180|240\";\n");
      out.write("s_a[3]=\"70|140|210|280\";\n");
      out.write("s_a[4]=\"80|160|240|320\";\n");
      out.write("function populateStates( countryElementId, stateElementId ){\n");
      out.write("\t\n");
      out.write("\tvar selectedCountryIndex = document.getElementById( countryElementId ).selectedIndex;\n");
      out.write("\n");
      out.write("\tvar stateElement = document.getElementById( stateElementId );\n");
      out.write("\t\n");
      out.write("\tstateElement.length=0;\t// Fixed by Julian Woods\n");
      out.write("\tstateElement.options[0] = new Option('Select State','');\n");
      out.write("\tstateElement.selectedIndex = 0;\n");
      out.write("\t\n");
      out.write("\tvar state_arr = s_a[selectedCountryIndex].split(\"|\");\n");
      out.write("\t\n");
      out.write("\tfor (var i=0; i<state_arr.length; i++) {\n");
      out.write("\t\tstateElement.options[stateElement.length] = new Option(state_arr[i],state_arr[i]);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function populateCountries(countryElementId, stateElementId){\n");
      out.write("\t// given the id of the <select> tag as function argument, it inserts <option> tags\n");
      out.write("\tvar countryElement = document.getElementById(countryElementId);\n");
      out.write("\tcountryElement.length=0;\n");
      out.write("\tcountryElement.options[0] = new Option('Select Country','-1');\n");
      out.write("\tcountryElement.selectedIndex = 0;\n");
      out.write("\tfor (var i=0; i<country_arr.length; i++) {\n");
      out.write("\t\tcountryElement.options[countryElement.length] = new Option(country_arr[i],country_arr[i]);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t// Assigned all countries. Now assign event listener for the states.\n");
      out.write("\n");
      out.write("\tif( stateElementId ){\n");
      out.write("\t\tcountryElement.onchange = function(){\n");
      out.write("\t\t\tpopulateStates( countryElementId, stateElementId );\n");
      out.write("\t\t};\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"panel2.jsp\" method=\"post\">\n");
      out.write("       Select Country (with states):   <select id=\"country\" name =\"country\"></select>\n");
      out.write("\n");
      out.write("Select State: <select name =\"state\" id =\"state\"></select>\n");
      out.write(" <script language=\"javascript\">\n");
      out.write("populateCountries(\"country\", \"state\");\n");
      out.write(" </script>\n");
      out.write(" <input type=\"submit\" value=\"submit\" name=\"submit\"/>\n");
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
