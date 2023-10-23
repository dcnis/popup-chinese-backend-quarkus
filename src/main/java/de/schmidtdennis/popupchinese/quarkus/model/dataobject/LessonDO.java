package de.schmidtdennis.popupchinese.quarkus.model.dataobject;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "lessons")
@Data
public class LessonDO extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String discussion;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "audio_url")
    private String audioUrl;

    private String difficulty;

}
