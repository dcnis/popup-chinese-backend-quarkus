package de.schmidtdennis.popupchinese.quarkus.model.valueobject;

import lombok.Data;

@Data
public class VocabularyVO {

    private Long id;
    private Long lessonId;
    private String category;
    private String pinyin;
    private String chinese;
    private String english;
    public Integer vocabularyOrder;

}
