package de.schmidtdennis.popupchinese.quarkus.model.request;

import lombok.Data;

@Data
public class VocabularyAddReq {
    private Long lessonId;
    private String category;
    private String pinyin;
    private String chinese;
    private String english;
    public Integer vocabularyOrder;
}
