package com.example.mail_sender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.example.mail_sender.Dto.MailDTO;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(MailDTO mailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mailDTO.getTo());
        message.setSubject("Portfolio message from  " + mailDTO.getName() + " " + mailDTO.getEmail() + ":");
        message.setText("Portfolio message from  " + mailDTO.getName() + " " + mailDTO.getEmail() + ":" + "\n\n\n" + mailDTO.getMessage());
        mailSender.send(message);
    }
}