
import java.sql.*;
import java.util.HashMap;
public class usinghashmap{
	public void map() throws SQLNonTransientConnectionException, Exception
	{
		String query="select * from data";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
		while(rs.next()) {
			String name=rs.getString("name");
			int roll=rs.getInt("roll_no");
			hash.put(roll, name);
		}
		for(Integer key:hash.keySet())
		{
			System.out.println(key+" "+hash.get(key));
			
		}
		
	}

}
