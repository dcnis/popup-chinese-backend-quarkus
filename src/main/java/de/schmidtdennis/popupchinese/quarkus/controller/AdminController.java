package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.DialogAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.request.LessonAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.request.UserAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.request.VocabularyAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.DialogVO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LessonVO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.UserVO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.VocabularyVO;
import de.schmidtdennis.popupchinese.quarkus.service.DialogService;
import de.schmidtdennis.popupchinese.quarkus.service.LessonService;
import de.schmidtdennis.popupchinese.quarkus.service.UserService;
import de.schmidtdennis.popupchinese.quarkus.service.VocabularyService;
import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Path("/api/admin/")
@Authenticated
@Slf4j
public class AdminController {

    @Inject
    private UserService userService;
    @Inject
    private LessonService lessonService;
    @Inject
    private DialogService dialogService;
    @Inject
    private VocabularyService vocabularyService;

    // Users

    @POST
    @Path("/user/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserVO addUser(UserAddReq user) {
        // TODO Validator
        return userService.add(user);
    }

    @POST
    @Path("/user/delete/{id:\\d+}")
    public boolean deleteUser(Integer id) {
        return userService.delete(id);
    }

    @GET
    @Path("/user/{id:\\d+}")
    public UserVO getUserById(Integer id){
        return userService.getById(id);
    }

    @GET
    @Path("/user/getAll")
    public List<UserVO> getAllUsers(){
        return userService.getAll();
    }

    // Lessons

    @POST()
    @Path("lesson/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public LessonVO addLesson(LessonAddReq lesson) {
        // TODO Validator
        return lessonService.add(lesson);
    }

    @POST
    @Path("/lesson/delete/{id:\\d+}")
    public boolean deleteLesson(Integer id) {
        return userService.delete(id);
    }

    // Dialogs

    @POST()
    @Path("/dialog/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public DialogVO addDialog(DialogAddReq dialog) {
        // TODO Validator
        return dialogService.add(dialog);
    }

    @POST()
    @Path("/dialog/delete/{id:\\d+}")
    public boolean deleteDialog(Integer id) {
        return dialogService.delete(id);
    }

    // Vocabulary

    @POST()
    @Path("/vocabulary/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public VocabularyVO addVocabulary(VocabularyAddReq vocabulary) {
        // TODO Validator
        return vocabularyService.add(vocabulary);
    }

    @POST()
    @Path("/vocabulary/delete/{id:\\d+}")
    public boolean deleteVocabulary(Integer id) {
        return vocabularyService.delete(id);
    }

}
