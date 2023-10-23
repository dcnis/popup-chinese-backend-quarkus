package de.schmidtdennis.popupchinese.quarkus.converter;

import de.schmidtdennis.popupchinese.quarkus.enums.Difficulty;
import de.schmidtdennis.popupchinese.quarkus.model.dataobject.LessonDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.LessonAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.LessonVO;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LessonConverter {

    public LessonDO toDO(LessonAddReq lesson) {
        LessonDO newLesson = new LessonDO();
        newLesson.setTitle(lesson.getTitle());
        newLesson.setDiscussion(lesson.getDiscussion());
        newLesson.setThumbnailUrl(lesson.getThumbnailUrl());
        newLesson.setAudioUrl(lesson.getAudioUrl());

        if(lesson.getDifficulty() != null){
            newLesson.setDifficulty(lesson.getDifficulty().name());
        }

        return newLesson;
    }

    public LessonVO toVO(LessonDO lessonDO) {
        LessonVO lessonVO = new LessonVO();

        lessonVO.setId(lessonDO.getId());
        lessonVO.setTitle(lessonDO.getTitle());
        lessonVO.setDiscussion(lessonDO.getDiscussion());
        lessonVO.setThumbnailUrl(lessonDO.getThumbnailUrl());
        lessonVO.setAudioUrl(lessonDO.getAudioUrl());

        if(lessonDO.getDifficulty() != null){
            lessonVO.setDifficulty(Difficulty.getEnumValue(lessonDO.getDifficulty()));
        }

        return lessonVO;
    }
}
