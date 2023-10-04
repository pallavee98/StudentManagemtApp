package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import in.JDBCutil.JDBCUtill;

public class InsertmysqlQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection =null;
		PreparedStatement Preparedstatement =null;
		
		try {
			connection=JDBCUtill.getJdbcConnection();
			if(connection!=null) {
				String mysqlOuery ="insert into student(id , name ,result) values (?,?,?)";
				Preparedstatement=connection.prepareStatement(mysqlOuery);
				
				if(Preparedstatement !=null) {
					Preparedstatement.setInt(1, 3);
					Preparedstatement.setString(2, "abhinav");
					Preparedstatement.setString(3, "pass");
					
					
					int roweffected = Preparedstatement.executeUpdate();
					
					if(roweffected != 0) {
						System.out.println("row insertedd");
						
					}else {
						System.out.println("row not insertedd");
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
