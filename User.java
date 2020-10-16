package com.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	private int userId;
	@NotEmpty
	private String userName;
	@Size(min=5 ,max=8 ,message"password must be between 5 to 8")
	private String password;

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
