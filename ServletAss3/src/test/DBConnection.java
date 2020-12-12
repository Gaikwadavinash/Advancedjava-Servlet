package test;
import java.sql.*;
public class DBConnection {
private static Connection con=null;
private DBConnection() {}
static {//Acess DBConnecton to DAO layer
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection
("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
}catch(Exception e) {e.printStackTrace();}
	
}
public static Connection getCon() {
	return con;
}
}
