package test;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class ServletBookRetrive extends GenericServlet {
public RetriveBookDAO ob;
@Override
public void init()throws ServletException{
ob=new RetriveBookDAO();	
}
@Override
public void service(ServletRequest req,ServletResponse res )
		throws IOException,ServletException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ResultSet rs=ob.retrive(req);
try {
	if(rs.next()) {
		pw.println(rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+
		"&nbsp&nbsp"+rs.getString(3)+"&nbsp&nbsp"+rs.getFloat(4)+
	"&nbsp&nbsp"+rs.getFloat(5));
	}else {
pw.println("Invalid Pid pls Enter Valid pid");
	RequestDispatcher rd=req.getRequestDispatcher("input.html");
rd.include(req,res);
	}
}catch(Exception e) {e.printStackTrace();}
}
@Override
public void destroy() {
	try {
	DBConnection.getCon().close();
	}catch(Exception e) {e.printStackTrace();}
}
}
