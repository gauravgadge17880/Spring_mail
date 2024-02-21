package com.spring_mail_sender.spring_mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.spring_mail_sender.spring_mail.model.SpringMail;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	@Value("${spring.mail.username}")
	private String formMail;
	public void sendMail(String mail, SpringMail mailstructure) throws NullPointerException{
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(formMail);
		simpleMailMessage.setSubject(mailstructure.getSubject());
		simpleMailMessage.setText(mailstructure.getMessage());
		simpleMailMessage.setTo(mail);
		mailSender.send(simpleMailMessage);
		
	}

}
