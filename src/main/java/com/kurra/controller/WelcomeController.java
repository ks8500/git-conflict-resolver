package com.kurra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/sravan")
public class WelcomeController {

    @GetMapping(path = "/welcome")
    public String welcome(){
        return "welcome";
    }

}
