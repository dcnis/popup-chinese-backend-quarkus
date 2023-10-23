package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.UserAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.UserVO;
import de.schmidtdennis.popupchinese.quarkus.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/user")
public class UserController {

    @Inject
    private UserService userService;

    @POST()
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserVO add(UserAddReq user) {
        // TODO Validator
        return userService.add(user);
    }

    @POST()
    @Path("/delete/{id:\\d+}")
    public boolean delete(Integer id) {
        return userService.delete(id);
    }

    @GET
    @Path("/{id:\\d+}")
    public UserVO get(Integer id){
        return userService.getById(id);
    }

    @GET
    @Path("/getAll")
    public List<UserVO> getAll(){
        return userService.getAll();
    }

}
