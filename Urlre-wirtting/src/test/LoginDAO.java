package test;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginDAO {
public ResultSet rs=null;	
public ResultSet login(HttpServletRequest req) {
try {	
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *from userresg28 where uname=? and pword=?");
ps.setString(1,req.getParameter("uname"));
ps.setString(2,req.getParameter("pword"));
rs=ps.executeQuery();
}catch(Exception e) {e.printStackTrace();}	
return rs;
}
}
