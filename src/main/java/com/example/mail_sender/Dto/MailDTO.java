package com.example.mail_sender.Dto;

import lombok.Data;

@Data
public class MailDTO {
    private String to;
    private String name;
    private String email;
    private String message;
}
