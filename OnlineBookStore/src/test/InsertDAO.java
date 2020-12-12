package test;
import java.sql.*;
import javax.servlet.*;
public class InsertDAO{
public int k=0;
public int insert(ServletContext sct) {
try {
	RegBean rb=(RegBean)sct.getAttribute("bean");
	Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("insert into USERRESG28 values(?,?,?,?,?,?,?)");
ps.setString(1,rb.getuName());
ps.setString(2,rb.getpWord());
ps.setString(3,rb.getfName());
ps.setString(4,rb.getlName());
ps.setString(5,rb.getAddr());
ps.setString(6,rb.getmId());
ps.setLong(7,rb.getPhNo());

 k=ps.executeUpdate();
}catch(Exception e) {e.printStackTrace();}
return k;
}
}
