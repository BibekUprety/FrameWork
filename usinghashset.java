import java.sql.*;
import java.util.HashSet;
public class usinghashset {
	public void map() throws SQLNonTransientConnectionException, Exception
	{
		String query="select * from data";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		HashSet <String> names=new HashSet<String>();
		while(rs.next()) {
			String name=rs.getString("name");
			names.add(name);
		}
		
		names.forEach(r->System.out.println(r));
		System.out.println("Unique Student id are :"+names.size());
		
	}
}
