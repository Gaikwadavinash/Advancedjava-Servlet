package test;
import java.sql.*;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class ServletRetrive  extends GenericServlet{

RetriveDAO ob;	
@Override
	public void init()throws ServletException{
		ob= new RetriveDAO();
	}
@Override
public void service(ServletRequest req,ServletResponse res)
throws IOException ,ServletException
{
PrintWriter pw= res.getWriter();
res.setContentType("text/html");
 ResultSet rs=ob.retrive(req);
 try {
if(rs.next()){
pw.println(rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+
		"&nbsp&nbsp"+rs.getFloat(3)+"&nbsp&nbsp"+rs.getInt(4));	
}else {
	pw.println("Invalid pid ");}
RequestDispatcher rd=req.getRequestDispatcher("input.html");
rd.include(req, res);
}
 catch(Exception e) {e.printStackTrace();}

}
@Override
public void destroy() {
	try {
DBConnection.getCon().close();		
	}catch(Exception e) {e.printStackTrace();}
}
}
