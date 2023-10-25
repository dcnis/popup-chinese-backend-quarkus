package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.valueobject.VocabularyVO;
import de.schmidtdennis.popupchinese.quarkus.service.VocabularyService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/api/vocabulary")
public class VocabularyController {

    @Inject
    private VocabularyService vocabularyService;

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
