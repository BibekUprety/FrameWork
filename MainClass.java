import java.sql.SQLNonTransientConnectionException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws SQLNonTransientConnectionException, Exception {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the choice");
			System.out.println("1.		Insert the data in the databases");
			System.out.println("2.		Array List");
			System.out.println("3.		Hash Map");
			System.out.println("4.		Hash Set");
			System.out.println("choose the any of the them");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				RandomVariable rv =new RandomVariable();
				rv.ran();
			break;
			
			case 2:
				UsingArray ua = new UsingArray();
				ua.array();
				break;
			case 3:
				usinghashmap hs =new usinghashmap();
				hs.map();
				
				break;
			case 4:
				usinghashset hm =new usinghashset();
				hm.map();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			
			}
			
		} while(true);
		
	}

}
