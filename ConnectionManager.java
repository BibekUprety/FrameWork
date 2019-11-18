import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLNonTransientConnectionException;

public class ConnectionManager {
	static Connection jdbcConnection() throws SQLNonTransientConnectionException,Exception
	{
		String url="jdbc:mysql://localhost:3306/csit_fourthsem";
		String name="root";
		String pass="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,name,pass);
		return con;
	}
	
	
}
