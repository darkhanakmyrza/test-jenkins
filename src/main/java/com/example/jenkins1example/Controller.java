package com.example.jenkins1example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/second")
    public String something(){
        return "second Hello";
    }






}
