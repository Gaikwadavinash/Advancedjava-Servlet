package test;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;
public class LoginDAO {
	public boolean z;
public boolean login(HttpServletRequest req,ServletContext sct)
throws ServletException,IOException{
	try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *from USERRESG28 where uname=? and pword=?");
ps.setString(1,req.getParameter("uname"));
ps.setString(2,req.getParameter("pword"));
ResultSet rs=ps.executeQuery();
if(rs.next()) {
z=true;
RegBean rb= new RegBean();
rb.setuName(rs.getString(1));
rb.setpWord(rs.getString(2));
rb.setfName(rs.getString(3));
rb.setlName(rs.getString(4));
rb.setAddr(rs.getString(5));
rb.setmId(rs.getString(6));
rb.setPhNo(rs.getLong(7));
sct.setAttribute("bean",rb);
sct.setAttribute("fName",rs.getString(3));
}
	}catch(Exception e) {e.printStackTrace();}
	return z;
}
}
