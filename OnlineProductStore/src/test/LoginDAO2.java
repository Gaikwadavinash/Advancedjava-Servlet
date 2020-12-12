package test;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
public class LoginDAO2 {
public boolean z;
public boolean login(HttpServletRequest req,ServletContext sct1) {
try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *From admin28 where uname=? and pword=?");
ps.setString(1,req.getParameter("uname"));
ps.setString(2,req.getParameter("pword"));
ResultSet rs=ps.executeQuery();
if(rs.next()) {
	z=true;	
sct1.setAttribute("fName",rs.getString(3));	
}
}
catch(Exception e) {e.printStackTrace();}
	return z;
}
}
