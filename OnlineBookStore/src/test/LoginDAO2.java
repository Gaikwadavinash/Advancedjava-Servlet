package test;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginDAO2 {
boolean z;
public boolean login(HttpServletRequest req ,ServletContext sct)
		throws 
ServletException,IOException{	
try{
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *from Admin28 where uname=? and pword=?");
ps.setString(1,req.getParameter("uname"));
ps.setString(2,req.getParameter("pword"));
ResultSet rs=ps.executeQuery();
if(rs.next()) {
z=true;
RegBean rb2= new RegBean();
rb2.setuName(rs.getString(1));
rb2.setpWord(rs.getString(2));
rb2.setfName(rs.getString(3));
rb2.setlName(rs.getString(4));
rb2.setAddr(rs.getString(5));
rb2.setmId(rs.getString(6));
rb2.setPhNo(rs.getLong(7));
sct.setAttribute("bean2", rb2);

}
}catch(Exception e) {e.printStackTrace();}
return z;
}

}
