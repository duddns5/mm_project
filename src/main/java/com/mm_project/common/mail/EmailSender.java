package com.mm_project.common.mail;

import java.util.Date;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.mm_project.common.code.Config;
import com.mm_project.common.code.ErrorCode;
import com.mm_project.common.exception.HandlableException;


@Component
public class EmailSender {
	
	JavaMailSender mailSender;
	
	public EmailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendEmail(String to, String subject, String htmlText) {
		
		MimeMessage msg = mailSender.createMimeMessage();
		
		try {
			msg.setFrom(Config.COMPANY_EMAIL.DESC);
			msg.setRecipients(Message.RecipientType.TO, to);
			msg.setSubject(subject);
			msg.setSentDate(new Date());
			msg.setText(htmlText, "utf-8", "html");
			mailSender.send(msg);
		} catch (MessagingException e) {
			throw new HandlableException(ErrorCode.MAIL_SEND_FAIL_ERROR);
		}
		
	}

}
