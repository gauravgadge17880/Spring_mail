package com.spring_mail_sender.spring_mail.ontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_mail_sender.spring_mail.model.SpringMail;
import com.spring_mail_sender.spring_mail.service.MailService;

@RestController
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@PostMapping("/send/{mail}")
	public String sendMail(@PathVariable String mail,@RequestBody SpringMail mailstructure) {
		mailService.sendMail(mail, mailstructure);
		return "Mail sent successfuly";
	}

}
