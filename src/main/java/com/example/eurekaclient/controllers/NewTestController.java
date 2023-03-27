package com.example.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class NewTestController {
    @GetMapping(value = "/main")
    public String testView() {
        return "Privet";
    }
}
