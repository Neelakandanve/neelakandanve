package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class n2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<form action=\"n13.jsp\">\n");

    Connection con;
    PreparedStatement ps,ps1,ps2,ps3;
    ResultSet rs;
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:NL");
        ps=con.prepareStatement("insert into det values(?,?,?,?,?,?,?,?,?,?,?)");
        ps1=con.prepareStatement("insert into re values(?)");
        ps2=con.prepareStatement("insert into detai values(?,?,?,?,?,?,?,?,?,?,?)");
        ps3=con.prepareStatement("insert into refe values(?)");
        ps.setString(1,request.getParameter("t1"));
        ps.setString(2,request.getParameter("t2"));
        ps.setString(3,request.getParameter("t3"));
        ps.setString(4,request.getParameter("t4"));
        ps.setString(5,request.getParameter("t5"));
        ps.setString(6,request.getParameter("t6"));
        ps.setString(7,request.getParameter("t7"));
        ps.setString(8,request.getParameter("t8"));
        ps.setString(9,request.getParameter("t9"));
        ps.setString(10,request.getParameter("t10"));
        ps.setString(11,request.getParameter("t11"));
        ps.executeUpdate();
        ps1.setString(1,request.getParameter("f1"));
        ps1.executeUpdate();
         out.println("<script>alert('Record Successfully')");
        ps2.setString(1,request.getParameter("t1"));
        ps2.setString(2,request.getParameter("t2"));
        ps2.setString(3,request.getParameter("t3"));
        ps2.setString(4,request.getParameter("t4"));
        ps2.setString(5,request.getParameter("t5"));
        ps2.setString(6,request.getParameter("t6"));
        ps2.setString(7,request.getParameter("t7"));
        ps2.setString(8,request.getParameter("t8"));
        ps2.setString(9,request.getParameter("t9"));
        ps2.setString(10,request.getParameter("t10"));
        ps2.setString(11,request.getParameter("t11"));
        ps2.executeUpdate();
        ps3.setString(1,request.getParameter("f1"));
        ps3.executeUpdate();
       
    }
    catch(Exception e)
    {
    }
    
      out.write("\n");
      out.write("    <a href=\"n3.jsp\">View</a>\n");
      out.write("</form>");
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
