<%@page import="java.sql.*"%>

<%
    Connection con;
    PreparedStatement ps,ps1,ps2,ps3;
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:NL");
        ps=con.prepareStatement("insert into det values(?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,request.getParameter("t1"));
        ps.setString(2,request.getParameter("t2"));
        ps.setString(3,request.getParameter("t3"));
        ps.setString(4,request.getParameter("r1"));
        ps.setString(5,request.getParameter("t4"));
        ps.setString(6,request.getParameter("t5"));
        ps.setString(7,request.getParameter("t6"));
        ps.setString(8,request.getParameter("t7"));
        ps.setString(9,request.getParameter("t8"));
        ps.setString(10,request.getParameter("t9"));
        ps.setString(11,request.getParameter("t10"));
        ps.setString(12,request.getParameter("t11"));
        ps.executeUpdate();
        ps1=con.prepareStatement("insert into re values(?)");
        ps1.setString(1,request.getParameter("f1"));
        ps1.executeUpdate();
        ps2=con.prepareStatement("insert into det values(?,?,?,?,?,?,?,?,?,?,?)");
        ps2.setString(1,request.getParameter("t1"));
        ps2.setString(2,request.getParameter("t2"));
        ps2.setString(3,request.getParameter("t3"));
        ps2.setString(4,request.getParameter("r1"));
        ps2.setString(5,request.getParameter("t4"));
        ps2.setString(6,request.getParameter("t5"));
        ps2.setString(7,request.getParameter("t6"));
        ps2.setString(8,request.getParameter("t7"));
        ps2.setString(9,request.getParameter("t8"));
        ps2.setString(10,request.getParameter("t9"));
        ps2.setString(11,request.getParameter("t10"));
        ps2.setString(12,request.getParameter("t11"));
        ps2.executeUpdate();
        ps3=con.prepareStatement("insert into re values(?)");
        ps3.setString(1,request.getParameter("f1"));
        ps3.executeUpdate();
                 out.println("<script>alert('Record Successfully!')</script>");
       
    }
    catch(Exception ex)
    {
    }
    %>
    <form action="n13.jsp">
        <input type="submit" value="view">
        
    </form>