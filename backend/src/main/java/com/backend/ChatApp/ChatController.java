package com.backend.ChatApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class ChatController {
    
    @GetMapping("")
    public String helloWorl() {
        return "hello world";
    }
    
}
