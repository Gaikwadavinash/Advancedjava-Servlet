package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BookDAO {
public boolean z;
public boolean bookcheck(HttpServletRequest req,ServletContext sct)
throws ServletException,IOException{
try {
	Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *from BOOKDETAILS28 WHERE bcode=?");
ps.setString(1,req.getParameter("bcode"));
ResultSet rs=ps.executeQuery();
if(rs.next()) {
	z=true;
	RegBean2 rb3= new RegBean2();	
rb3.setbCode(rs.getString(1));
rb3.setbName(rs.getString(2));
rb3.setbAuthor(rs.getString(3));
rb3.setbPrice(rs.getFloat(4));
rb3.setbQty(rs.getInt(5));
sct.setAttribute("bean3", rb3);	
}
}catch(Exception e) {e.printStackTrace();}
return z;
}
}
