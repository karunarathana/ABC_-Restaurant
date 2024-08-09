package com.abcrestaurent.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.abcrestaurent.dto.LoginDTO;
import com.abcrestaurent.service.LoginService;

/**
 * This is the controller class which helps to handle login request
 * @author Nipun Sandeepa Karunarathana
 * @since  2024/08/09
 * @version 1.0
 */

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginService loginService = new LoginService();
	private LoginDTO loginDTO; 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside the loggin controller");
		
		// get values coming from request
		String userType = request.getParameter("type");
		String userEmail = request.getParameter("email");
		String userPass = request.getParameter("pass");
		System.out.println("Username " + userEmail + " and" + " Password " + userPass +"UserType"+userType);
		
		//call the login service class
		loginDTO = new LoginDTO(userType,userEmail,userPass);
		String responseBody = loginService.validateUser(loginDTO);
		System.out.println(responseBody);
	}

}
