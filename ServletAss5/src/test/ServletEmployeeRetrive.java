package test;
import java.sql.*;
import javax.servlet.*;
import java.io.*;
public class ServletEmployeeRetrive extends GenericServlet
{
	public ServletEmployeeDAO ob;
@Override
public void init() throws ServletException{
	ob=new ServletEmployeeDAO();
}
@Override
public void service(ServletRequest req,ServletResponse res)
		throws IOException,ServletException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ResultSet rs=ob.retrive(req);
try {
if(rs.next()) {
pw.println(rs.getString(1)+"&nbsp&nbsp"+"&nbsp&nbsp"+
rs.getString(2)+"&nbsp&nbsp"+rs.getString(3)+"&nbsp&nbsp"+
		rs.getFloat(4));
	
}else {
pw.println("Invalid Employee Pls Enter Valid EmployeeID");
RequestDispatcher rd=req.getRequestDispatcher("input.html");
rd.include(req, res);
}
}catch(Exception e) {e.printStackTrace();}
}
public void destroy() {
	try {
		DBConnection.getCon().close();
	}catch(Exception e) {e.printStackTrace();}
}
}

