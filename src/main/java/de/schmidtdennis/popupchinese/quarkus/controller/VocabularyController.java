package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.VocabularyAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.VocabularyVO;
import de.schmidtdennis.popupchinese.quarkus.service.VocabularyService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/vocabulary")
public class VocabularyController {

    @Inject
    private VocabularyService vocabularyService;

    @POST()
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public VocabularyVO add(VocabularyAddReq vocabulary) {
        // TODO Validator
        return vocabularyService.add(vocabulary);
    }

    @POST()
    @Path("/delete/{id:\\d+}")
    public boolean delete(Integer id) {
        return vocabularyService.delete(id);
    }

    @GET
    @Path("/{id:\\d+}")
    public VocabularyVO get(Integer id){
        return vocabularyService.getById(id);
    }

    @GET
    @Path("/lessonId/{id:\\d+}")
    public List<VocabularyVO> getByLessonId(Long id){
        return vocabularyService.getByLessonId(id);
    }

    @GET
    @Path("/getAll")
    public List<VocabularyVO> getAll(){
        return vocabularyService.getAll();
    }

}
