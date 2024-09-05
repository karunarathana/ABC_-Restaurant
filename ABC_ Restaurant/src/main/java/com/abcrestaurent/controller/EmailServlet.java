package com.abcrestaurent.controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.abcrestaurent.service.EmailServices;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * This is the controller class which helps to handle login request
 * @author Nipun Sandeepa Karunarathana
 * @since  2024/09/01
 * @version 1.0
 */

@WebServlet("/sendEmail")
public class EmailServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public EmailServices emailServices;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fogotEmail = request.getParameter("fogot_email");
		if(fogotEmail.isEmpty()) {
			request.setAttribute("ErrorResponse", "enter_email");
			request.getRequestDispatcher("forgot.jsp").forward(request, response);
		}else {
			emailServices = new EmailServices();
			
			String mailResponse = emailServices.sendEmailCustomer(fogotEmail);
			if(mailResponse == "Send successfully") {
			
				request.setAttribute("ErrorResponse", mailResponse);
				request.getRequestDispatcher("verify.jsp").forward(request, response);

			}else {
				request.getRequestDispatcher("frogot.jsp").forward(request, response);
			}
		}
		
		
	   }

	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.getWriter().println("Use POST method to send an email.");
	   }

}
