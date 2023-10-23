package de.schmidtdennis.popupchinese.quarkus.model.valueobject;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DialogVO {
    private Long id;
    private Long lessonId;
    private String pinyin;
    private String chinese;
    private String english;
    private String speaker;

    @Column(name = "dialog_order")
    private Integer dialogOrder;
}
