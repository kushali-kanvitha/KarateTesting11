package com.example;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RegistrationController {

    @PostMapping("/register")
    public Map<String,String> register(@RequestBody Map<String,String> data){

        // Later you can save this to SQLite

        return data;
    }

}