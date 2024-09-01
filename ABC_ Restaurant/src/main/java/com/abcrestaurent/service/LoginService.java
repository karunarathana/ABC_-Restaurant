package com.abcrestaurent.service;

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
	
	public String validateUser(LoginDTO loginDto) {
		 loginModel = new LoginModel(loginDto.getUserType(),loginDto.getEmail(), loginDto.getPassword());
		 String response = loginRepo.checkUser(loginModel);
		 return response;
	}
	

}
