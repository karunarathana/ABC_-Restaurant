package com.abcrestaurent.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailServices {
	public String sendEmailCustomer(String to) {
		
		 // Sender's email credentials
        final String from = "abcrestaurantsrilanka@gmail.com";
        final String password = "hgzk cwxb dcky umha";
        final String toEmail = to;
        String sentOtpCode = genarateOTP();

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };
        
        Session session = Session.getInstance(props, auth);
        
        MimeMessage msg = new MimeMessage(session);
        
        try {
            msg.addHeader("Content-type", "text/html; charset=UTF-8");
            msg.setFrom(from);
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            msg.setSubject("Reset Password", "UTF-8");
            String content = "<h1>Hello"+"Amila"+"</h1>"+"<p>Our OTP Code is  "+sentOtpCode
                    + "<a href="+""+">Click here</a></p>";
            msg.setContent(content, "text/html; charset=UTF-8");
            Transport.send(msg);
            System.out.println("Send successfully");
            return "Send successfully";
        } catch (Exception e) {
            System.out.println("Send error");
            System.out.println(e);
            return "Send Error";
        }
	}
	public String genarateOTP() {
		return "12345";
	}
}
