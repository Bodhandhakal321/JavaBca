import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DbTest {

	public DbTest() {
		
	}

	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/myinfo",
					"root","");
			//System.out.println("test");
			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery(
					"select * from myinfo");
			int id;
			String FullName;
			String Address;
			while(resultSet.next()) {
				id = resultSet.getInt("id");
				FullName = resultSet.getString("Full Name");
				Address = resultSet.getString("Address");
				System.out.println("id:" +id
					+"  Full Name : " +FullName+" Address : " +Address);
			}
			resultSet.close();
			statement.close();
			connection.close();
					
			
			
		}
		catch(Exception e) {
			System.out.println("e");
		}
		

	}

}