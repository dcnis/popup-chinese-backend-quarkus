package de.schmidtdennis.popupchinese.quarkus.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LessonService {

    public String greeting(){
        return "my app";
    }

}
