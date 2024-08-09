package com.abcrestaurent.model;


/**
 * This is the controller class which helps to handle login request
 * @author Nipun Sandeepa Karunarathana
 * @since  2024/08/09
 * @version 1.0
 */

public class LoginModel {
	
	private String userType;
	private String email;
	private String password;
	
	
	public LoginModel(String userType, String email, String password) {
		super();
		this.userType = userType;
		this.email = email;
		this.password = password;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
