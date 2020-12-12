package test;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@SuppressWarnings("serial")
public class LoginDAO1  {
public boolean z;
public boolean login(HttpServletRequest req,ServletContext sct1)
throws ServletException,IOException{
try {	
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *From userresg28 where uname=? and pword=?");
ps.setString(1,req.getParameter("uname"));
ps.setString(2,req.getParameter("pword"));
ResultSet rs=ps.executeQuery();	
	if(rs.next()) {
	z=true;
//RegBean rb1=new RegBean();
//rb1.setuName(rs.getString(1));
//rb1.setpWord(rs.getString(2));
//rb1.setfName(rs.getString(3));
//rb1.setlName(rs.getString(4));
//rb1.setAddr(rs.getString(5));
//rb1.setmId(rs.getString(6));
//rb1.setPhNo(rs.getLong(7));

sct1.setAttribute("fName",rs.getString(3));
	}	
}catch(Exception e) {e.printStackTrace();}
	return z;
}
}
