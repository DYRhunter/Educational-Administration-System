package dbconnect;
import java.sql.*;
public class connect {
	public static Connection getConnection() {
		String url = "jdbc:mariadb://127.0.0.1:3306/eas";
		String name = "manager";
		String ps = "manager";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,name,ps);
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("数据库连接出错");
			System.exit(0);
			return null;
		}	
	}
}
