package com.example.demo;

 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class day1 {
 
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }  
}
