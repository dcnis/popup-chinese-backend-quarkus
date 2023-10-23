package de.schmidtdennis.popupchinese.quarkus.model.dataobject;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "vocabularies")
@Setter
@Getter
public class VocabularyDO extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lesson_id")
    private Long lessonId;

    private String category;

    private String pinyin;
    private String chinese;
    private String english;

    @Column(name = "vocabulary_order")
    public Integer vocabularyOrder;

}
