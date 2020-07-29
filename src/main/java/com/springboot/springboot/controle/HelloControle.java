package com.springboot.springboot.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControle {

    @GetMapping("/")
    public  String helloMessage(){
        return "Ola mundo, com spring boot";
                
    }
}
