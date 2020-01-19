package com.so.picture.movie.controller;


import com.so.picture.movie.entry.Mail;
import com.so.picture.movie.entry.ServerResponse;
import com.so.picture.movie.service.MqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private MqService mqService;

    @GetMapping("/test")
    public String test(){
        return "test Movie";
    }

    @PostMapping("/send")
    public ServerResponse sendMail(@Validated Mail mail, Errors errors) {
        if (errors.hasErrors()) {
            String msg = errors.getFieldError().getDefaultMessage();
            return ServerResponse.error(msg);
        }

        return mqService.send(mail);
    }
}
