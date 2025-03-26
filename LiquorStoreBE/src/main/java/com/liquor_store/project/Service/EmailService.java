package com.liquor_store.project.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	private JavaMailSender mailSender;
	
	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendEmail( String Subject, String body) {
		
		String emailTo = "gunvamshidharreddy@gmail.com";
		
		SimpleMailMessage  message = new SimpleMailMessage();
		message.setTo(emailTo);
		message.setSubject(Subject);
	    message.setText(body);	
	    mailSender.send(message);
	}

}