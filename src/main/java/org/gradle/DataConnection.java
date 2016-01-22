package org.gradle;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class DataConnection {

	public Connection getConnection() throws SQLException, JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Config.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("org/gradle/connection.xml");
		Config config = (Config) jaxbUnmarshaller.unmarshal(resourceAsStream);

		Connection conn = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", config.getUserName());
		connectionProps.put("password", config.getPassword());

		conn = DriverManager.getConnection(
				"jdbc:" + config.getDbms() + "://" + config.getServerName() + "/" + config.getDbName(),
				connectionProps);

		System.out.println("Connected to database");
		return conn;
	}
}
