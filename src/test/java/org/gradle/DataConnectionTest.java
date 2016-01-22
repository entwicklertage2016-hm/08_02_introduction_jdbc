package org.gradle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.bind.JAXBException;

import org.junit.Test;

public class DataConnectionTest {

	@Test
	public void canEstablishDBConnection() throws SQLException, JAXBException {
		DataConnection conn = new DataConnection();
		Connection connection = conn.getConnection();
		Statement st = connection.createStatement();
		ResultSet results = st.executeQuery("Select * from drinks;");
		while (results.next()) {
			System.out.println(results.getString("name"));
			System.out.println("\t" + results.getString("description"));

		}

	}
}
