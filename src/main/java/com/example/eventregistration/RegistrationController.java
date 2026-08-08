package com.example.eventregistration;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin
public class RegistrationController {

    @PostMapping
    public Registration register(@RequestBody Registration registration) {

        System.out.println("New Registration:");
        System.out.println("Name: " + registration.getName());
        System.out.println("Email: " + registration.getEmail());
        System.out.println("Phone: " + registration.getPhone());
        System.out.println("Event: " + registration.getEvent());
        System.out.println("Date: " + registration.getDate());

        return registration;
    }
}