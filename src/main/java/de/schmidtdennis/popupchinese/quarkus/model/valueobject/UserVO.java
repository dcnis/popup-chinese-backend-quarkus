package de.schmidtdennis.popupchinese.quarkus.model.valueobject;

import lombok.Data;

@Data
public class UserVO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String roles;
    private String passwordHash;
}
