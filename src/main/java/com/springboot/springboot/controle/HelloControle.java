package com.springboot.springboot.controle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControle {

    @GetMapping("")
    public  ResponseEntity<?> helloMessage(){
    	
        return ResponseEntity.ok(new String("Ola mundo, com spring boot"));
                
    }
}
