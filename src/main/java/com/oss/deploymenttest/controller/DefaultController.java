package com.oss.deploymenttest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/hey")
    public String helloThere(){

        return "Hey there";
    }

}
