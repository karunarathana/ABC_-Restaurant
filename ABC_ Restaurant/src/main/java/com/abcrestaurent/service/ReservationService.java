package com.abcrestaurent.service;

import com.abcrestaurent.dto.ReservationDTO;
import com.abcrestaurent.model.ReservationModel;
import com.abcrestaurent.repository.ReservationRepo;

public class ReservationService {
	public ReservationModel reservationModel;
	public ReservationRepo reservationRepo;
	
	public String saveCustomerReservation(ReservationDTO reservationDTO) {
		reservationRepo = new ReservationRepo();
		reservationModel = new ReservationModel(reservationDTO.getBranch(), reservationDTO.getNoOfGuest(),reservationDTO.getDate() ,reservationDTO.getTime(), reservationDTO.getNic(), reservationDTO.getfName(), reservationDTO.getpNumber());
		String response = reservationRepo.saveUser(reservationModel);
		return response;
	}
}
