package com.example.eventregistration;

public class Registration {

    private String name;
    private String email;
    private String phone;
    private String event;
    private String date;

    public Registration() {
    }

    public Registration(String name, String email, String phone,
                        String event, String date) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.event = event;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}