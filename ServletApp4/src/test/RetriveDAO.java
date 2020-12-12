package test;
import java.sql.*;
import javax.servlet.*;
public class RetriveDAO {
public ResultSet rs=null;	
public ResultSet retrive(ServletRequest req) {
try {
Connection	con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *From product28 where pid=?");
ps.setString(1,req.getParameter("pid"));
rs=ps.executeQuery();
}catch(Exception e) {e.printStackTrace();}
return rs;
}
}
