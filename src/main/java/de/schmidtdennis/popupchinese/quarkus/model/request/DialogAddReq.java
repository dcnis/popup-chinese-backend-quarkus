package de.schmidtdennis.popupchinese.quarkus.model.request;

import lombok.Data;

@Data
public class DialogAddReq {
    private Long lessonId;
    private String pinyin;
    private String chinese;
    private String english;
    private String speaker;
    private Integer dialogOrder;
}
