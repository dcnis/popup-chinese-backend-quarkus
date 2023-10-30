package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.valueobject.HistoryItemVO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LikeVO;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.UserVO;
import de.schmidtdennis.popupchinese.quarkus.service.HistoryService;
import de.schmidtdennis.popupchinese.quarkus.service.LikeService;
import de.schmidtdennis.popupchinese.quarkus.service.UserService;
import io.quarkus.security.identity.SecurityIdentity;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import java.util.List;

@Path("/api/users")
public class UserController {

    @Inject
    private UserService userService;

    @Inject
    private LikeService likeService;

    @Inject
    private HistoryService historyService;

    @Inject
    private SecurityIdentity identity;

    @GET
    @Path("/me")
    public UserVO get(){
        String username = identity.getPrincipal().getName();
        return userService.getByEmail(username);
    }

    @GET
    @Path("/myIdentity")
    public String getMyIdentity(){
        return identity.getPrincipal().getName();
    }

    @POST
    @Path("/likes/add")
    public LikeVO addLike(@QueryParam("lessonId") Long lessonId){
        String userEmail = identity.getPrincipal().getName();
        return likeService.add(userEmail, lessonId);
    }

    @GET
    @Path("/likes/getAll")
    public List<LikeVO> getLikes(){
        String userEmail = identity.getPrincipal().getName();
        return likeService.getAll(userEmail);
    }

    @POST
    @Path("/history/add")
    public HistoryItemVO addHistoryItem(@QueryParam("lessonId") Long lessonId){
        String userEmail = identity.getPrincipal().getName();
        return historyService.add(userEmail, lessonId);
    }

    @GET
    @Path("/history")
    public List<HistoryItemVO> getHistory(){
        String userEmail = identity.getPrincipal().getName();
        return historyService.getAll(userEmail);
    }

}
