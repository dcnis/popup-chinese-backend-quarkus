package de.schmidtdennis.popupchinese.quarkus.model.dataobject;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.Username;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import io.quarkus.security.jpa.UserDefinition;

@Entity
@Table(name = "users")
@Setter
@Getter
@UserDefinition
public class UserDO extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Username
    private String email;

    @Password
    @Column(name = "password_hash")
    private String passwordHash;

    @Roles
    private String roles;

}
