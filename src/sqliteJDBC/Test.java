package sqliteJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws Exception{
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection(
				"jdbc:sqlite:main.db");
			// ����Statement
			Statement stmt = conn.createStatement();
			// ִ�в�ѯ
			ResultSet rs = stmt.executeQuery("select * from guitar");
		
	}
}
