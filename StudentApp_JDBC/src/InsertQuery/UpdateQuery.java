package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.JDBCutil.JDBCUtill;

public class UpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection =null;
		PreparedStatement preparedStatement =null;
		
		try {
			connection=JDBCUtill.getJdbcConnection();
			String myquery="update student set result=? where roolnum=?";
			preparedStatement=connection.prepareStatement(myquery);
			
			if(preparedStatement !=null) {
				preparedStatement.setString(1,"fail");
				preparedStatement.setInt(2,2);
			}
			
			int roweffected =preparedStatement.executeUpdate();
			if(roweffected ==1) {
				System.out.println("effected");
			}else
				System.out.println("not effected");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
