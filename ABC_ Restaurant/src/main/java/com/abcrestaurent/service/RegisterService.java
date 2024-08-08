package com.abcrestaurent.service;

import com.abcrestaurent.dto.RegisterDTO;
import com.abcrestaurent.model.RegisterModel;
import com.abcrestaurent.repository.RegisterRepo;

/**
 * This is the service class which helps to perform login functionality
 * @author Nipun Sandeepa Karunarathna
 * @since 2024/08/08
 * @version 1.0
 */

public class RegisterService {
	
	private RegisterRepo regiterRepo = new RegisterRepo();
	private RegisterModel registerModel;
	
	public String registerUser(RegisterDTO registerDTO) {
		registerModel = new RegisterModel(registerDTO.getUserType(),registerDTO.getUserEmail(),registerDTO.getUserTel(),registerDTO.getuPass(),registerDTO.isAgree());
		String response = regiterRepo.saveUser(registerModel);
		return response;
	}


}
