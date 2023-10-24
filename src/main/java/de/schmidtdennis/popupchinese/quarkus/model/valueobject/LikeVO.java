package de.schmidtdennis.popupchinese.quarkus.model.valueobject;

import lombok.Data;


@Data
public class LikeVO {
    private Long id;
    private String userEmail;
    private Long lessonId;
    private Long gmtTimestamp;
}
