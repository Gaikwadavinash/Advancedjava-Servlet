package test;
import java.sql.*;
import javax.servlet.*;
public class RetriveBookDAO{
public ResultSet rs=null; 	
public ResultSet retrive(ServletRequest req) {
	try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *From bookdetails28 where bcode=?");
ps.setString(1,req.getParameter("bcode"));
rs=ps.executeQuery();
	}catch(Exception e) {e.printStackTrace();}
	return rs;
}
}
