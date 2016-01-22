package org.gradle;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Config {
	private String userName;

	private String password;

	private String serverName;

	private int portNumber;

	private String dbms;

	private String dbName;

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getServerName() {
		return serverName;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public String getDbms() {
		return dbms;
	}

	public String getDbName() {
		return dbName;
	}

}
