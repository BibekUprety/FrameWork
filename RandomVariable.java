import java.sql.Connection;
import java.sql.SQLNonTransientConnectionException;
import java.sql.Statement;
import java.util.Random;
import java.util.UUID;

public class RandomVariable {
	public void ran() throws SQLNonTransientConnectionException, Exception {
		Random random =new Random();
		int roll=0;
		String name;
		for(int i=0;i<5;i++) 
		{	
			System.out.print(".");
			roll=random.nextInt(10000);
			
			String c[]= {"Bsc CSIT","BIT","BSW","MBA","MBBS"};
			String course=c[new Random().nextInt(c.length)];
			  roll=random.nextInt(1000); 
			  name=Long.toHexString(random.nextInt());
			  String query="insert into data(roll_no,name,course)values('"+roll+"','"+name+"','"+course+"')";
				Connection con=ConnectionManager.jdbcConnection();
				Statement st=con.createStatement();
				st.executeUpdate(query);
	}
		System.out.println("Data inserted successfully");

}

	
}