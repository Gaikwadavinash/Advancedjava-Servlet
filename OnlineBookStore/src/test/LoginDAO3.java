package test;
import java.awt.print.Book;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginDAO3 {
	public Connection con=null;
//	public boolean z;
//public boolean login3(HttpServletRequest req,ServletContext sct)
//throws IOException,ServletException{
public	ArrayList<RegBean2> b1= new ArrayList();
public ArrayList<RegBean2> login(){
		try {
	Connection con=DBConnection.getCon();	

//Statement st=con.createStatement();

PreparedStatement ps=con.prepareStatement
("Select *From BOOKDETAILS28");
ResultSet rs=ps.executeQuery();

//ResultSet rs=st.executeQuery("Select *From BOOKDETAILS28");
	
while(rs.next()) { 
//	z=true;
	RegBean2 rb3= new RegBean2();
rb3.setbCode(rs.getString(1));
rb3.setbName(rs.getString(2));
rb3.setbAuthor(rs.getString(3));
rb3.setbPrice(rs.getFloat(4));
rb3.setbQty(rs.getInt(5));
//sct.setAttribute("bean3", rb3);
b1.add(rb3);
}
}catch(Exception e) {e.printStackTrace();}
	//return z;
	return b1;
}
}

