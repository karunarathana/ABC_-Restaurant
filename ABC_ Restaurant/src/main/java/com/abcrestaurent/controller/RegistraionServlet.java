package com.abcrestaurent.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.abcrestaurent.dto.RegisterDTO;
import com.abcrestaurent.service.RegisterService;

@WebServlet("/Register")

public class RegistraionServlet extends HttpServlet {
	
	private RegisterService registerService = new RegisterService();
	private RegisterDTO registerDTO;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside the register controller");
		
		//get values coming from request
		String userType = request.getParameter("type").toString();
		String userEmail = request.getParameter("email").toString();
		String userTel = request.getParameter("tel").toString();
		String userPass = request.getParameter("pass").toString();
		boolean agree = request.getParameter("agree") != null;
		
		//get values assign from registerDTO
		registerDTO = new RegisterDTO(userType,userEmail,userTel,userPass,agree);
		
		//call the registerService class
		String responseMessage = registerService.registerUser(registerDTO);
		System.out.println(responseMessage);
	}

}
