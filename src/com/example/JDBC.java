package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC {

	public static void main(final String[] args) throws Exception {

		// db is scg
		final String url = "jdbc:mysql://localhost:3306/scg";
		final String uname = "root";
		final String pass = "Root_1234";
//		final String query = "select * from student";
		final String query = "insert into student values(2,'mary')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		final Connection con = DriverManager.getConnection(url, uname, pass);
		final Statement st = con.createStatement();
//		final ResultSet rs = st.executeQuery(query);
		st.executeUpdate(query);
//		while (rs.next()) {
//			final int id = rs.getInt("id");
//			final String name = rs.getString("name");
//			System.out.println(id + ":" + name);
//		}
		st.close();
		con.close();

	}

}
