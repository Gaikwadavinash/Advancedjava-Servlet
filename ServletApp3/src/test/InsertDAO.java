package test;
import javax.servlet.*;
import java.sql.*;
public class InsertDAO {
public int k;
public int insert(ServletRequest req) {
	try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("insert into PRODUCT28 values(?,?,?,?)");
ps.setString(1,req.getParameter("pid"));
ps.setString(2,req.getParameter("pname"));
ps.setFloat(3,Float.parseFloat(req.getParameter("pprice")));
ps.setInt(4,Integer.parseInt(req.getParameter("pqty")));
k=ps.executeUpdate();
	}catch(Exception e) {e.printStackTrace();}
	return k;
}
}

