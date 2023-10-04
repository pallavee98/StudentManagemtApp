package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.RowSet;

import in.JDBCutil.JDBCUtill;



public class selectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection =null;
		PreparedStatement PreparedStatement =null;
		ResultSet resultset =null;
		
		try {
			connection=JDBCUtill.getJdbcConnection();
			String myquery = "select*from student where id=?";
			PreparedStatement=connection.prepareStatement(myquery);
			
			if(PreparedStatement !=null) {
				PreparedStatement.setInt(1,1);
			}
			
			rs=PreparedStatement.executeQuery();
			
			if(rs!=null) {
				if(rs.next()) {
					System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
					
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
