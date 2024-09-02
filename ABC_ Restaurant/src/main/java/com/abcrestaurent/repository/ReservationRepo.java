package com.abcrestaurent.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.abcrestaurent.model.ReservationModel;



public class ReservationRepo {
	Connection con = null;
	public String saveUser(ReservationModel reservationModel) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_restaurent","root","root");
			PreparedStatement pst = con.prepareStatement("insert into customer_reservation(branchName,noOfGuest,reserveDate,reserveTime,cusNic,cusFullName,cusTel) values(?,?,?,?,?,?,?)");
			pst.setString(1, reservationModel.getBranch());
			pst.setString(2, reservationModel.getNoOfGuest());
			pst.setString(3, reservationModel.getDate());
			pst.setString(4, reservationModel.getTime());
			pst.setString(5, reservationModel.getNic());
			pst.setString(6, reservationModel.getfName());
			pst.setString(7, reservationModel.getpNumber());
			
			int rowCout = pst.executeUpdate();
			if(rowCout>0) {
				return "Reservation Successfully";
			}else {
				return "Reservation UnSuccessfully";
			}
		} catch (Exception e) {
			return "Error Occcured Reservation Method"+e;
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
