package com.example.springbootemailex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class MyEmailDemo {

    @Autowired
    private JavaMailSender sender;

    public boolean sendMail(String from, String[] to, String cc, String bcc, String subject, String text, Resource file) {

        boolean sent = false;
        try {
            MimeMessage message = sender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, file != null ? true : false);

            helper.setFrom(from);
            helper.setTo(to);

            if (cc != null && cc.length() > 0) {
                helper.addCc(cc);
            }
            if (bcc != null && bcc.length() > 0) {
                helper.addBcc(bcc);
            }
            helper.setSubject(subject);
            helper.setText(text);
            if (file != null) {
                helper.addAttachment(file.getFilename(), file);
            }
            sender.send(message);
            sent = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sent;
    }
}
