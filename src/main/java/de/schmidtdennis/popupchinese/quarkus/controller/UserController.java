package de.schmidtdennis.popupchinese.quarkus.controller;

import de.schmidtdennis.popupchinese.quarkus.model.request.UserAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.UserVO;
import de.schmidtdennis.popupchinese.quarkus.service.UserService;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;

import java.util.List;

@Path("/user")
public class UserController {

    @Inject
    private UserService userService;

    @POST
    @Path("/add")
    @PermitAll
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserVO add(UserAddReq user) {
        // TODO Validator
        return userService.add(user);
    }

    @POST
    @RolesAllowed("admin")
    @Path("/delete/{id:\\d+}")
    public boolean delete(Integer id) {
        return userService.delete(id);
    }

    @GET
    @RolesAllowed(value = {"user", "admin"})
    @Path("/myaccount")
    public UserVO get(@Context SecurityContext securityContext){
        String username = securityContext.getUserPrincipal().getName();
        return userService.getByEmail(username);
    }

    @GET
    @RolesAllowed("admin")
    @Path("/{id:\\d+}")
    public UserVO get(Integer id){
        return userService.getById(id);
    }

    @GET
    @RolesAllowed("admin")
    @Path("/getAll")
    public List<UserVO> getAll(){
        return userService.getAll();
    }

}
