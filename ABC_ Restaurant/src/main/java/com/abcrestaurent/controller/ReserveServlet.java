package com.abcrestaurent.controller;

import java.io.IOException;

import com.abcrestaurent.dto.ReservationDTO;
import com.abcrestaurent.service.ReservationService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addReservation")
public class ReserveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReservationDTO reservationDTO;
	private ReservationService reservationService;

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get values coming from request
				String branch = request.getParameter("btype");
				String noOfGuest = request.getParameter("nog");
				String date = request.getParameter("rdate");
				String fullName = request.getParameter("fname");
				String time = request.getParameter("rtime");
				String nic = request.getParameter("nic");
				String pNumber = request.getParameter("tel");
				
				reservationDTO = new ReservationDTO(branch,noOfGuest,date,time,nic,fullName,pNumber);
				reservationService = new ReservationService();
				
				String reservationResp = reservationService.saveCustomerReservation(reservationDTO);
				if(reservationResp != null) {
					request.setAttribute("ReservationResponse", reservationResp);
				    request.getRequestDispatcher("index.jsp").forward(request, response);
				}
	}

}
