package com.abcrestaurent.service;

import java.util.ArrayList;
import java.util.List;

import com.abcrestaurent.dto.LoginDTO;
import com.abcrestaurent.model.LoginModel;
import com.abcrestaurent.repository.LoginRepo;

/**
 * This is the controller class which helps to handle login request
 * @author Nipun Sandeepa Karunarathana
 * @since  2024/08/09
 * @version 1.0
 */

public class LoginService {
	
	private LoginRepo loginRepo = new LoginRepo();
	private LoginModel loginModel;
	
	public  List<String> errorMessage = new ArrayList<String>();
	public  List<String> response = new ArrayList<String>();
	
	public List<String> validateUser(LoginDTO loginDto) {
		errorMessage.clear();
		//Validation User Input
		if (loginDto.getUserType().equals("plsselect")) {
			errorMessage.add("Status Error");
            errorMessage.add("User type is required.");
        }
		if (!loginDto.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			errorMessage.add("Status Error");
        	errorMessage.add("Invalid email format.");
        }
		if(loginDto.getPassword().isEmpty()) {
			errorMessage.add("Status Error");
        	errorMessage.add("Password is required.");
        }
		if(!errorMessage.isEmpty()) {
			return errorMessage;
		}else {
		 loginModel = new LoginModel(loginDto.getUserType(),loginDto.getEmail(), loginDto.getPassword());
		 response.clear();
		 response.add(loginRepo.checkUser(loginModel));
		 return response;
		}
	}
	

}
