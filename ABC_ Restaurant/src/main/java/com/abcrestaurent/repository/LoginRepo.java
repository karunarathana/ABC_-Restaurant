package com.abcrestaurent.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abcrestaurent.model.LoginModel;

/**
 * This is the controller class which helps to handle login request
 * @author Nipun Sandeepa Karunarathana
 * @since  2024/08/09
 * @version 1.0
 */

public class LoginRepo {
	Connection con = null;
	public String checkUser(LoginModel loginModel) {
		String responseMessage = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_restaurent","root","root");
			PreparedStatement pst = con.prepareStatement("select * from registered_user_details where emailaddress = ?");
			pst.setString(1, loginModel.getEmail());
			
			ResultSet rs  = pst.executeQuery();
			if(rs.next()) {
				String dType = rs.getString("usertype");
				String dUEmail =  rs.getString("emailaddress");
				String dUPass = rs.getString("userpassword");
				
				if(dType.equals(loginModel.getUserType())) {
					if(dUPass.equals(loginModel.getPassword())) {
						responseMessage = "Login SuccessFully";
						return responseMessage;
					}else {
						responseMessage = "User Password Doesnt Matched";
						return responseMessage;
					}
				}
			}else {
				responseMessage = "Invalid Email";
				return responseMessage;
			}
			return responseMessage;
			
		} catch (Exception e) {
			return "Error Occcured Register SaveUser Method"+e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
