package com.example.eurekaclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class NewTestController {

    @Value("${eureka.instance.instance-id}")
    private String idName;

    @GetMapping(value = "/main")
    public String testView() {
        return "idName: " + idName;
    }
}
