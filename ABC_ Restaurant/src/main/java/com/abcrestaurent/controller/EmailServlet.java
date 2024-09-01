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
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Sender's email credentials
	        final String username = "sandeepanipun7260@gmail.com";
	        final String password = "hedx vlrb rsvs tqye";
	        final String toEmail = "darkmango620@gmail.com";

	        // Email properties
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.mail.com"); // Replace with your SMTP server
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.socketFactory.port", "587");// Port number
	        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");// Port number
	        props.put("mail.debug", "true");

	        // Create a session with an Authenticator
	        Session session = Session.getInstance(props, new Authenticator() {
	        	@Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });

	        try {
	            // Compose the email message
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(username));
	            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
	            message.setSubject("Hello");
	            message.setText("Your OTP Code is 885533");

	            // Send the email
	            Transport.send(message);

	            // Provide feedback to the user
	            response.getWriter().println("Email sent successfully!");

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.getWriter().println("Use POST method to send an email.");
	    }

}
