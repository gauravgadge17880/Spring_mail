package com.spring_mail_sender.spring_mail.model;


public class SpringMail {
	private String subject;
	private String message;
	public SpringMail(String subject, String message) {
		super();
		this.subject = subject;
		this.message = message;
	}
	@Override
	public String toString() {
		return "SpringMail [subject=" + subject + ", message=" + message + "]";
	}
	public SpringMail() {
		super();
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
