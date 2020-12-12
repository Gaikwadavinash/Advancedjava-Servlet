package test;
import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class UpdateDAO extends HttpServlet {
	public int k;
public int update2(RegBean2 rb3) { 
try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("update Bookdetails28 set bname=?,bauthor=?,bprice=?,bqty=? where bcode=? ");
ps.setString(1,rb3.getbName());
ps.setString(2,rb3.getbAuthor());
ps.setFloat(3,rb3.getbPrice());
ps.setInt(4,rb3.getbQty());
ps.setString(5,rb3.getbCode());
k=ps.executeUpdate();
}catch(Exception e) {e.printStackTrace();}
return k;
}
}
