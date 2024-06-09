package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Demo1Application {
    @Autowired
    private EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail(){
        String to = "thivuu0710@gmail.com";
        String subject = "Test Email";
        String text = "This is a test email.";
        emailService.sendSimpleMessage(to, subject, text);
    }


}
