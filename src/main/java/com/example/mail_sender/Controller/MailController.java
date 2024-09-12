package com.example.mail_sender.Controller;

import com.example.mail_sender.Dto.MailDTO;
import com.example.mail_sender.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send")
    public String sendMail(@RequestBody MailDTO mailDTO) {
        mailService.sendEmail(mailDTO);
        return "Email inviata con successo!";
    }
}