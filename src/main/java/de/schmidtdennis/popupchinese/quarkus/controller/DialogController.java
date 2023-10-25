package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.valueobject.DialogVO;
import de.schmidtdennis.popupchinese.quarkus.service.DialogService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/api/dialog")
public class DialogController {

    @Inject
    private DialogService dialogService;

    @GET
    @Path("/id/{id:\\d+}")
    public DialogVO get(Integer id){
        return dialogService.getById(id);
    }

    @GET
    @Path("/lessonId/{id:\\d+}")
    public List<DialogVO> getByLessonId(Long id){
        return dialogService.getByLessonId(id);
    }

    @GET
    @Path("/getAll")
    public List<DialogVO> getAll(){
        return dialogService.getAll();
    }

}
