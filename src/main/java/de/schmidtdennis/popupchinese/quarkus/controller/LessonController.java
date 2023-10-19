package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.service.LessonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestQuery;

@Path("/hello")
public class LessonController {

    @Inject
    private LessonService lessonService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@RestQuery String name) {
        return lessonService.greeting(name);
    }

}
