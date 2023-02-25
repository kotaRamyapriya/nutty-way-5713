package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	
	public static Connection getConnection() {
		
		Connection con=null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101project","root","Lakshmitg");
			
		}catch(Exception e){}
		
		return con;

	}

}
