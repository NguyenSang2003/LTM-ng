package b9_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	private Connection conn = null;

	public void closeConnection() throws SQLException {
		if (conn != null)
			conn.close();
	}

	public DAO() {
		String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
		String dbname = "";
		String url = "jdbc:ucanaccess://" + dbname;
		Class.forName(driver);
		conn = DriverManager.getConnection(url);
	}

	public boolean checkUserName(String uname) {
		return false;
	}

	public boolean login(String uname, String password) {
		return false;
	}

	public String findByID(String id) {
		int stId = Integer.parseInt(id);// Doi String id duoc nhap vao thanh int
	}return list;

	}

	public String findByName(String partName)throws SQLException {
		String sql = "select * from student where stname like ?";
		PreparedStatement stat= conn.
		return list;
	}
}
