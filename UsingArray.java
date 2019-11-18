import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLNonTransientConnectionException;
import java.util.ArrayList;
import java.util.Collections;

public class UsingArray {
	public void array() throws SQLNonTransientConnectionException, Exception {
		String query="select * from data";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st= con.createStatement();
		ResultSet rs=(st).executeQuery(query);
		
		ArrayList<Integer> rollno=new ArrayList<Integer>();
		while(rs.next())
		{
		int roll_no=rs.getInt("roll_no");
		rollno.add(roll_no);
		}
		Collections.sort(rollno);
		rollno.forEach(r->System.out.println(r));
		System.out.println("Total Numbers of Students:"+rollno.size());
		
		int max=Collections.max(rollno);
		System.out.println("Maximum value"+max);
		
		int min=Collections.min(rollno);
		System.out.println("Minimum value"+min);
		
		
	}
}
