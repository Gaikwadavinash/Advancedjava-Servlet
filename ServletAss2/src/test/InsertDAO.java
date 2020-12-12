package test;
import javax.servlet.*;
import java.sql.*;
public class InsertDAO {
public	int k=0;
public int insert(ServletRequest req) {
	try{
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("update bookdetails28 set bprice=? where bcode=?");
ps.setFloat(1,Float.parseFloat(req.getParameter("bprice")));
ps.setString(2,req.getParameter("bcode"));

k=ps.executeUpdate();
	}catch(Exception e) {e.printStackTrace();}
	return k;
}
}
