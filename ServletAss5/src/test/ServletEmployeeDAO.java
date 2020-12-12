package test;
import java.sql.*;
import javax.servlet.*;
public class ServletEmployeeDAO {
public ResultSet rs=null;
public ResultSet retrive(ServletRequest req) {
	try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *from employee28 where id=?");
ps.setString(1,req.getParameter("id"));
rs=ps.executeQuery();
}catch(Exception e) {e.printStackTrace();}
	return rs;
}
}