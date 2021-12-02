package application;
import java.sql.*;

public class OracleCon {
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully!");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.57.35:1521:xe","system","hamoodic123");
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not loaded");
		}
		catch(SQLException e)
		{
			System.out.println("Connection not established");
		}
	}

}
