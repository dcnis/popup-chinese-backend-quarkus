package de.schmidtdennis.popupchinese.quarkus.model.request;

import lombok.Data;

@Data
public class UserAddReq {
    private String firstName;
    private String lastName;
    private String email;
}
