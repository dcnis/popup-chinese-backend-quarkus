package de.schmidtdennis.popupchinese.quarkus.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name = "lessons")
@Data
public class Lesson extends PanacheEntity {
    private Long id;
    private String name;
}
