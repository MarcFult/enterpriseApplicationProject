package com.example.sampleOne.models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class sample {

    @GetMapping
    public String GetMessage() {
        return "Hello world! I live!!!!!!!!!";
    }

}
