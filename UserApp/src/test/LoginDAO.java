package test;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
public class LoginDAO extends HttpServlet{
public boolean z;
public boolean login(HttpServletRequest req,ServletContext sct)
throws ServletException,IOException{
	try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *From userresg28 where uname=? and pword=?");
ps.setString(1,req.getParameter("uname"));
ps.setString(2,req.getParameter("pword"));
ResultSet rs=ps.executeQuery();
if(rs.next()) {
	z=true;
RegBean	rb= new RegBean();

sct.setAttribute("bean2", rb);
rb.setfName(rs.getString(1));
rb.setpWord(rs.getString(2));
rb.setfName(rs.getString(3));
rb.setlName(rs.getString(4));
rb.setAddr(rs.getString(5));
rb.setMid(rs.getString(6));
rb.setPhno(rs.getLong(7));
sct.setAttribute("bean",rb);//imp for display Name
}	
}catch(Exception e) {e.printStackTrace();}
	return z;
}

}
