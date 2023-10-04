package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.JDBCutil.JDBCUtill;

public class deleteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection =null;
		PreparedStatement PreparedStatement =null;
		
		try {
			connection =JDBCUtill.getJdbcConnection();
			String myquery ="delete from student where roolnum=?";
			PreparedStatement=connection.prepareStatement(myquery);
			
			PreparedStatement.setInt(1,2);
			
			int deleted = PreparedStatement.executeUpdate();
			
			if(deleted==1) {
				System.out.println("deleted");
			}else
				System.out.println("not deleted");
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
