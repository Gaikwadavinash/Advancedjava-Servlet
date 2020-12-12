package test;
import java.sql.*;
public class UpdateDAO {
	public int k;
public int update(RegBean rb) {
	try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("update userresg28 set addr=?, mid=? where uname=? and pword=?");
ps.setString(1,rb.getAddr());
ps.setString(2,rb.getMid());
//ps.setLong(3,rb.getPhno());
ps.setString(3,rb.getuName());
ps.setString(4,rb.getpWord());
 k=ps.executeUpdate();
	}catch(Exception e) {e.printStackTrace();}
	return k;
}

}
