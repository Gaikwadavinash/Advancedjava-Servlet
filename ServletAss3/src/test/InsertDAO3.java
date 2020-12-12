package test;
import java.sql.*;
import javax.servlet.*;
public class InsertDAO3 {
	public int k=0;
	public float total,hra,da;
	public int insert(ServletRequest req){
		try{	
	Connection con=DBConnection.getCon();
	PreparedStatement ps=con.prepareStatement
	("insert into employeedata28 values(?,?,?,?,?)");
	ps.setString(1,req.getParameter("eid"));
	ps.setString(2,req.getParameter("ename"));
	ps.setString(3,req.getParameter("edesg"));
	ps.setFloat(4,Float.parseFloat(req.getParameter("bsal")));
	
	da=(Float.parseFloat(req.getParameter("bsal")))*0.63F+
			(Float.parseFloat(req.getParameter("bsal")));
	hra=(Float.parseFloat(req.getParameter("bsal")))*0.93F+
			(Float.parseFloat(req.getParameter("bsal")));
	total=da+hra;
	ps.setFloat(5,total);

 k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}


}
