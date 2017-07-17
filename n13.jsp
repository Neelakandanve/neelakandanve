<%@page import="java.sql.*"%>
<%
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
    %>
        