package com.abcrestaurent.service;

import java.util.ArrayList;
import java.util.List;

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
	public  List<String> errorMessage = new ArrayList<String>();
	public  List<String> response = new ArrayList<String>();
	
	public List<String> registerUser(RegisterDTO registerDTO) {
		errorMessage.clear();
		//Validation User Input
		if (registerDTO.getUserType().equals("plsselect")) {
			errorMessage.add("Status Error");
            errorMessage.add("User type is required.");
        }
		if (registerDTO.getUserTel().isEmpty()) {
			errorMessage.add("Status Error");
        	errorMessage.add("phone number is required.");
        }
		if (!registerDTO.getUserEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			errorMessage.add("Status Error");
        	errorMessage.add("Invalid email format.");
        }
		if(registerDTO.getuPass().isEmpty()) {
			errorMessage.add("Status Error");
        	errorMessage.add("Password is required.");
        }
		if(!errorMessage.isEmpty()) {
			return errorMessage;
		}else {
			registerModel = new RegisterModel(registerDTO.getUserType(),registerDTO.getUserEmail(),registerDTO.getUserTel(),registerDTO.getuPass(),registerDTO.isAgree());
			response.clear();
			response.add(regiterRepo.saveUser(registerModel));
			return response;
		}
	}
	public void sendEmailToTheUser() {
		System.out.println("Email Sed to the user");
	}


}
