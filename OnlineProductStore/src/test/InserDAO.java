package test;
import javax.servlet.*;
import java.sql.*;
public class InserDAO {
public int k=0;
public int insert(ServletContext sct1) {
	try {
		RegBean rb1=(RegBean)sct1.getAttribute("bean");
Connection con=DBConnection.getCon();
PreparedStatement ps= con.prepareStatement
("insert into USERRESG28 values(?,?,?,?,?,?,?)");
ps.setString(1,rb1.getuName());
ps.setString(2,rb1.getpWord());
ps.setString(3,rb1.getfName());
ps.setString(4,rb1.getlName());
ps.setString(5,rb1.getAddr());
ps.setString(6,rb1.getmId());
ps.setLong(7,rb1.getPhNo());
k=ps.executeUpdate();
}catch(Exception e) {e.printStackTrace();}
return k;
}
}
