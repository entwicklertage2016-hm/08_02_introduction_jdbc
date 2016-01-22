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

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	public void setDbms(String dbms) {
		this.dbms = dbms;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

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
