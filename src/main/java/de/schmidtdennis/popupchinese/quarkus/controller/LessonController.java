package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.service.LessonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class LessonController {

    @Inject
    private LessonService lessonService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return lessonService.greeting();
    }

}
