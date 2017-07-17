package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class n13_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    Connection con;
    PreparedStatement ps,ps1,ps2,ps3;
    ResultSet rs,rs1;
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:NL");
        ps=con.prepareStatement("select * from det");
        rs=ps.executeQuery();
        if(rs.next())
        {
            out.println("First Name:"+(rs.getString(1)));
            out.println("Middle Name:"+(rs.getString(2)));
            out.println("Last Name:"+(rs.getString(3)));
            out.println("Gender:"+(rs.getString(4)));
            out.println("Date Of Birth:"+(rs.getString(5)));
            out.println("Email Id:"+(rs.getString(6)));
            out.println("Phone Number:"+(rs.getString(7)));
            out.println("Father's Name:"+(rs.getString(8)));
            out.println("Mother's Name:"+(rs.getString(9)));
            out.println("Nationality:"+(rs.getString(10)));
            out.println("Caste:"+(rs.getString(11)));
            
        }
        ps1=con.prepareStatement("Select * from re");
        rs1=ps1.executeQuery();
        if(rs1.next())
        {
            out.println("Resume:"+rs1.getString(1));
        }
    }
    catch(Exception e)
    {
    }
    
      out.write("\n");
      out.write("        ");
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
