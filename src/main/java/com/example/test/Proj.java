package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
#comment
@RestController
public class Proj {
    @GetMapping("/myproj")
    public String getData(){
        return "We are learning devops";
    }
}
