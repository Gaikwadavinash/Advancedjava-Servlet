package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class DeleteDAO {
public boolean z;
public boolean delete(HttpServletRequest req,ServletContext sct)
throws ServletException,IOException{
try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("delete from BOOKDETAILS28 where bcode=?");
ps.setString(1,req.getParameter("bcode"));
ResultSet rs=ps.executeQuery();
if(rs.next()) {
z=true;	
//RegBean2 rb3= new RegBean2();
//sct.getAttribute("bean3");
}
}catch(Exception e) {e.printStackTrace();}
	return z;
}

}
