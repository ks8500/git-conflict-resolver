package com.kurra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/sravan")
public class WelcomeController {


    //some thing changed by main
    //some thing edited by main
    @GetMapping(path = "/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping(path = "/welcome1")//changed by feature //changed by main
    public String welcome1ByMain(){
        String a = new String("sravan");//by main
        int b = 10; // feature
        double d = 1; //by main
        String k = new String("Main"); //main
        return "welcome";
    }

    @GetMapping(path = "/welcome2") //changed by feature
    public String welcome2ByMain(){
        return "welcome";
    }
}
