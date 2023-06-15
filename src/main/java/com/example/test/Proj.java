package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Proj {
    @GetMapping("/myproj")
    public String getData(){
        return "Devops is a mixture of Develoment, QA and Operations team";
    }
}
