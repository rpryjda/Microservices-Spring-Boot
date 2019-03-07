package com.pryjda.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping("/display")
    public String showMessage(){
        return "Second service";
    }
}
