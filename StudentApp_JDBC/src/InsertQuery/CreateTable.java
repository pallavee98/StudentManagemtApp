package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.JDBCutil.JDBCUtill;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement preparedStatement =null;
		
		try {
			connection=JDBCUtill.getJdbcConnection();
			if(connection != null) {
				String query ="create table student (id int ,name varchar(200),result varchar(30))";
				preparedStatement =connection.prepareStatement(query);
				int roweff=preparedStatement.executeUpdate();
				
				if(roweff ==1) {
					System.out.println("row insertedd");
				}else
					System.out.println("row insertedd");
				
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
