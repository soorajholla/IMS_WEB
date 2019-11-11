//DBConnection.java
package inventory.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
public static Connection createConnection()
{
Connection con = null;
String url = "jdbc:sqlserver://localhost\\sqlexpress;databaseName=IMS"; 
//String url = "jdbc:sqlserver://localhost:3306/IMS"; //MySQL URL followed by the database name
String username = "root"; // username
String password = "root123!"; // password

try 
{
try 
{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //loading SQL Server drivers. This differs for database servers 
} 
catch (ClassNotFoundException e)
{
e.printStackTrace();
}
con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
System.out.println("Printing connection object "+con);
} 
catch (Exception e) 
{
e.printStackTrace();
}
return con; 
}
}