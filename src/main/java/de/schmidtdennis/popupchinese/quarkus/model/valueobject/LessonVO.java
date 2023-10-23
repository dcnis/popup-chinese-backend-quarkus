package de.schmidtdennis.popupchinese.quarkus.model.valueobject;

import de.schmidtdennis.popupchinese.quarkus.enums.Difficulty;
import lombok.Data;

@Data
public class LessonVO {
    private Long id;
    private String title;
    private String discussion;
    private String thumbnailUrl;
    private String audioUrl;
    private Difficulty difficulty;
}
