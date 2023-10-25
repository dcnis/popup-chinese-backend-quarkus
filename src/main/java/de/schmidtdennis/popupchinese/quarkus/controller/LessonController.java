package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LessonVO;
import de.schmidtdennis.popupchinese.quarkus.service.LessonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/api/lesson")
public class LessonController {

    @Inject
    private LessonService lessonService;

    @GET
    @Path("/{id:\\d+}")
    public LessonVO get(Integer id){
        return lessonService.getById(id);
    }

    @GET
    @Path("/getAll")
    public List<LessonVO> getAll(){
        return lessonService.getAll();
    }

}
