package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.Lesson;
import de.schmidtdennis.popupchinese.quarkus.service.LessonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.List;

@Path("/lesson")
public class LessonController {

    @Inject
    private LessonService lessonService;

    @POST()
    @Path("/create")
    @Produces(MediaType.TEXT_PLAIN)
    public String create(@RestQuery String name) {
        return lessonService.create(name);
    }

    @GET
    @Path("/get")
    public Lesson get(@RestQuery String name){
        return lessonService.get(name);
    }

    @GET
    @Path("/getAll")
    public List<Lesson> get(){
        return lessonService.getAll();
    }

}
