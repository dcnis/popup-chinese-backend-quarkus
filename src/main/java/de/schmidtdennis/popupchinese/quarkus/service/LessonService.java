package de.schmidtdennis.popupchinese.quarkus.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LessonService {

    public String greeting(String name){
        return "Welcome to my app " + name;
    }

}
