package com.abcrestaurent.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.abcrestaurent.model.RegisterModel;

public class RegisterRepo {
	Connection con = null;
	public String saveUser(RegisterModel registerModel) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_restaurent","root","root");
			PreparedStatement pst = con.prepareStatement("insert into registered_user_details(usertype,emailaddress,phonenumber,userpassword) values(?,?,?,?)");
			pst.setString(1, registerModel.getUserType());
			pst.setString(2, registerModel.getUserEmail());
			pst.setString(3, registerModel.getUserTel());
			pst.setString(4, registerModel.getuPass());
			
			int rowCout = pst.executeUpdate();
			if(rowCout>0) {
				return "Registration Successfully";
			}else {
				return "Registration UnSuccessfully";
			}
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
