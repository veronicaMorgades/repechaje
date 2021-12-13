package Persistencia;

import java.sql.*;

public class DBConf {
	public String driver = "com.mysql.cj.jdbc.Driver";
	public String database = "Repechaje";
	public String hostname = "127.0.0.1";
	public String port = "3306";
	public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public String username = "root";
	public String password = "";

	public Connection conectarMySQL() {
		Connection conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

}