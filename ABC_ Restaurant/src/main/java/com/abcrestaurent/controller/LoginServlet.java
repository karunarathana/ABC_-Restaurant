package com.abcrestaurent.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
	
		
		//call the login service class
		loginDTO = new LoginDTO(userType,userEmail,userPass);
		List<String> responseBody = loginService.validateUser(loginDTO);
		
		if(responseBody.get(0) == "Status Error") {
			request.setAttribute("ErrorResponse", responseBody);
		    request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			if(responseBody.get(0) == "Login SuccessFully") {
				
				switch (userType) {
			    case "customer":
			    	request.setAttribute("ErrorResponse", responseBody);
			    	request.getRequestDispatcher("index.jsp").forward(request, response);
			        break;
				case "admin":
					request.setAttribute("ErrorResponse", "DOne");
					request.getRequestDispatcher("admin.jsp").forward(request, response);	        
					break;
				case "branch":
					request.setAttribute("ErrorResponse", responseBody);
					request.getRequestDispatcher("branch.jsp").forward(request, response);
				    break;

			    default:
			    	System.out.println("User Type Not Defined Please try again");
			        break;
				}
				
			}else {
				request.setAttribute("ErrorResponse", responseBody);
			    request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		}
		
		System.out.println(responseBody);
	}

}
