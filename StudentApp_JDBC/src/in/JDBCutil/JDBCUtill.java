package in.JDBCutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtill {
	
	public static Connection getJdbcConnection() throws IOException, SQLException{
		FileInputStream fis = new FileInputStream("Application.properties");
		Properties p= new Properties();
		p.load(fis);
		//extracting data from application file
		String url =p.getProperty("url");
		String user =p.getProperty("user");
		String password =p.getProperty("password");
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		
		Connection connection =DriverManager.getConnection(url, user, password);
		
		return connection;
		
	}
	public static void closeResources(Connection connection, PreparedStatement Preparedstatement,ResultSet Resultset) throws SQLException {
		if(connection!=null) {
			connection.close();
		}if(Preparedstatement!=null) {
			Preparedstatement.close();
		}
		//for selectquery --------->
		if(Resultset!=null) {
			 Resultset.close();
		}
		
	}

}
