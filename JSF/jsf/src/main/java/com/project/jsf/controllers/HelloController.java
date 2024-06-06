package com.project.jsf.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class HelloController {
    private String message;

    public String getMessage() {
        return message;
    }

    public void sayHello(String name) {
        message = "Hello, " + name + "!";
    }

}