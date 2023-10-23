package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.DialogAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.DialogVO;
import de.schmidtdennis.popupchinese.quarkus.service.DialogService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/dialog")
public class DialogController {

    @Inject
    private DialogService dialogService;

    @POST()
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public DialogVO add(DialogAddReq dialog) {
        // TODO Validator
        return dialogService.add(dialog);
    }

    @POST()
    @Path("/delete/{id:\\d+}")
    public boolean delete(Integer id) {
        return dialogService.delete(id);
    }

    @GET
    @Path("/{id:\\d+}")
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