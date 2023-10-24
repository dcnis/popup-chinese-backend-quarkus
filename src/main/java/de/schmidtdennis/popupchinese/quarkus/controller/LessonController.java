package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.LessonAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LessonVO;
import de.schmidtdennis.popupchinese.quarkus.service.LessonService;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/lesson")
public class LessonController {

    @Inject
    private LessonService lessonService;

    @POST()
    @RolesAllowed("admin")
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public LessonVO add(LessonAddReq lesson) {
        // TODO Validator
        return lessonService.add(lesson);
    }

    @POST()
    @RolesAllowed("admin")
    @Path("/delete/{id:\\d+}")
    public boolean delete(Integer id) {
        return lessonService.delete(id);
    }

    @GET
    @PermitAll
    @Path("/{id:\\d+}")
    public LessonVO get(Integer id){
        return lessonService.getById(id);
    }

    @GET
    @PermitAll
    @Path("/getAll")
    public List<LessonVO> getAll(){
        return lessonService.getAll();
    }

}
