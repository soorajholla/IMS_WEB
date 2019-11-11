//LoginDao.java
package inventory.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import inventory.bean.RegisterBean;
import inventory.util.DBConnection;
import java.sql.*;

public class LoginDao {
	
	Connection con = null;
	
	public RegisterBean checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
		
		con = DBConnection.createConnection();
		String sql = "SELECT * FROM Users WHERE Email = ? and Password = ?"; //Insert user details into the table 'USERS'
		PreparedStatement statement = con.prepareStatement(sql); //Making use of prepared statements here to insert bunch of data
		statement.setString(1, email);
		statement.setString(2, password);
		
		ResultSet result = statement.executeQuery();

		RegisterBean user = null;

		if (result.next()) {
			user = new RegisterBean();
			user.setFullName(result.getString("fullname"));
			user.setEmail(email);
		}

		con.close();

		return user;
	}
	
}